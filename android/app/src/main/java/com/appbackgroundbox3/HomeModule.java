package com.appbackgroundbox3;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

public class HomeModule extends ReactContextBaseJavaModule {

    public HomeModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Home";
    }

    @ReactMethod
    void navigateToHome() {
        Activity activity = getCurrentActivity();
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
    }
}
