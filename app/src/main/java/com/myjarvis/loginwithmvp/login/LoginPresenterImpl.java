package com.myjarvis.loginwithmvp.login;

import android.text.TextUtils;

/**
 * Created by jarvis on 02-May-16
 * at  10:26 AM .
 */
public class LoginPresenterImpl implements LoginPresenter {

    LoginView myLoginView;

    // implementing the method from LoginPresenter Interface


    public LoginPresenterImpl(LoginView myLoginView) {
        this.myLoginView = myLoginView;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            myLoginView.showValidationError();
        } else {
            if (username.equals("username") && password.equals("password")) {
                myLoginView.loginSuccess();
            } else {
                myLoginView.loginError();
            }
        }
    }
}
