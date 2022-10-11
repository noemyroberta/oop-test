package com.ufal.test.exercise_3.beans;

public class LoginImplementation {

    private ILogin loginType;

    public LoginImplementation() {
    }

    public void signIn() {
        loginType.signIn();
    }

    public ILogin getLoginType() {
        return loginType;
    }

    public void setLoginType(ILogin loginType) {
        this.loginType = loginType;
    }
}
