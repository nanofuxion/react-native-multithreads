package com.reactlibrary;

import com.facebook.react.ReactPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;

public class RNThreadPackage implements ReactPackage {

    private final ReactNativeHost reactNativeHost;
    private final ReactPackage[] additionalThreadPackages;

    public RNThreadPackage(ReactNativeHost reactNativeHost, ReactPackage... additionalThreadPackages) {
        this.reactNativeHost = reactNativeHost;
        this.additionalThreadPackages = additionalThreadPackages;
    }

    @NonNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @NonNull
    @Override
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
        return Collections.<NativeModule>singletonList(
                new RNThreadModule(reactContext, reactNativeHost, additionalThreadPackages)
        );
    }
}