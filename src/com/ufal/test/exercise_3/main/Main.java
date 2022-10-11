package com.ufal.test.exercise_3.main;

import com.ufal.test.exercise_3.beans.*;

public class Main {

    public static void main(String[] args) {
        LoginImplementation loginImpl = new LoginImplementation();

        ILogin google = new GoogleLogin("00123");
        ILogin formulary = new FormularyLogin("cleyfane@gmail.com", "918236445");
        ILogin iCloud = new iCloudLogin("00x33");
        ILogin facebook = new FacebookLogin("cleyfane@gmail.com");

        loginImpl.setLoginType(google);
        loginImpl.signIn();

        loginImpl.setLoginType(formulary);
        loginImpl.signIn();

        loginImpl.setLoginType(iCloud);
        loginImpl.signIn();

        loginImpl.setLoginType(facebook);
        loginImpl.signIn();
    }

}
