package com.myjarvis.loginwithmvp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.myjarvis.loginwithmvp.R;
import com.myjarvis.loginwithmvp.home.HomeActivity;

/*
jarvisSachin Property
made by jarvis
*/

public class LoginActivity extends AppCompatActivity implements LoginView {

    EditText mainActivityUsernameEditText, mainActivityPasswordEditText;

    Button mainActivitySignInButton;

    String usernameEntered, passwordEntered = null;

    LoginPresenter myLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // instantiating the Presenter Interface with Presenter Impletation Class

        myLoginPresenter = new LoginPresenterImpl(this);


        //getting the reference to the views from xml

        mainActivityUsernameEditText = (EditText) findViewById(R.id.loginActivityUsernameEditText);
        mainActivityPasswordEditText = (EditText) findViewById(R.id.loginActivityPasswordEditText);
        mainActivitySignInButton = (Button) findViewById(R.id.loginActivitySignInButton);

       /*important cool concepts*/
        mainActivityUsernameEditText.setFilters(new InputFilter[]{
                new InputFilter() {
                    @Override
                    public CharSequence filter(CharSequence cs, int start,
                                               int end, Spanned spanned, int dStart, int dEnd) {
                        // TODO Auto-generated method stub
                        if (cs.equals("")) { // for backspace
                            return cs;
                        }
                        if (cs.toString().matches("[0-9]+")) {
                           /* int  i=cs.length();
                            cs = cs.subSequence(1,i-1);
                            Log.e("---", "---------" + cs.toString());
                            Log.e("---1", "---------" +""+spanned);*/
                            return "";
                        }

                        return cs;
                    }
                }
        });

        mainActivitySignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameEntered = mainActivityUsernameEditText.getText().toString();
                passwordEntered = mainActivityPasswordEditText.getText().toString();

                Log.d("username", ":" + usernameEntered);
                Log.d("password", ":" + passwordEntered);
                myLoginPresenter.login(usernameEntered, passwordEntered);
            }
        });

    }

    @Override
    public void showValidationError() {

        Toast.makeText(LoginActivity.this, "Enter Valid Cradentials", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {

        Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();

        Intent intentTo = new Intent(this, HomeActivity.class);
        startActivity(intentTo);

    }

    @Override
    public void loginError() {

        Toast.makeText(LoginActivity.this, "some other error", Toast.LENGTH_SHORT).show();
    }
}