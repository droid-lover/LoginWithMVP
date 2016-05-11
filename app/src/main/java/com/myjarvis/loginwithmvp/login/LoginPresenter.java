package com.myjarvis.loginwithmvp.login;

/**
 * Created by jarvis on 02-May-16
 * at  10:25 AM .
 */
public interface LoginPresenter {

    /**
     * Login.
     *
     * @param username the username
     * @param password the password
     */

    void login(String username, String password);
}
