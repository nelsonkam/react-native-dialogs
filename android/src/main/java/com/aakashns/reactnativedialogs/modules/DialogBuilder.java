package com.aakashns.reactnativedialogs.modules;

import android.content.DialogInterface;
import android.view.View;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.simplelist.MaterialSimpleListAdapter;
import com.afollestad.materialdialogs.simplelist.MaterialSimpleListItem;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UiThreadUtil;

import java.lang.reflect.InvocationTargetException;

public class DialogBuilder extends ReactContextBaseJavaModule {

    // Returns true if the dialog that is being built is
    // a determinate progress dialog.
    private boolean isDeterminateProgress = false;
    MaterialDialog.Builder mBuilder;
    MaterialDialog mDialog;

    @Override
    public String getName() {
        return "DialogBuilder";
    }


    public DialogBuilder(ReactApplicationContext reactContext) {
        super(reactContext);
        this.mBuilder = new MaterialDialog.Builder(getCurrentActivity());
    }

    @ReactMethod
    public void title(String title) {
      this.mBuilder.title(title);
    }

    @ReactMethod
    public void content(String content) {
      this.mBuilder.content(content);
    }

    @ReactMethod
    public void show() {
      this.mBuilder.show();
    }

    
}
