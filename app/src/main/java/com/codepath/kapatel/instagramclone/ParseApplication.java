package com.codepath.kapatel.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dPedjztbZU99DMsNpmDArqnwfbXxej60M6DLZ1Th")
                .clientKey("uePi6J9uga9Y4IDuWpQeT0EHXlpTEXrxmv4RWuLI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
