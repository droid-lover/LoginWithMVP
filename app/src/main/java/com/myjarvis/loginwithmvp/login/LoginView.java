package com.myjarvis.loginwithmvp.login;

/**
 * Created by jarvis on 02-May-16
 * at  10:27 AM .
 */
public interface LoginView {

    /**
     * Show validation error.
     */
    void showValidationError();

    /**
     * Login success.
     */
    void loginSuccess();

    /**
     * Login error.
     */
    void loginError();

}
