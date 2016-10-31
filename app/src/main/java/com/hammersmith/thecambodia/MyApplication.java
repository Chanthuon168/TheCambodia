package com.hammersmith.thecambodia;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.MaterialCommunityModule;
import com.joanzapata.iconify.fonts.MaterialModule;

/**
 * Created by Chan Thuon on 9/8/2016.
 */
public class MyApplication extends Application {

    public static final String TAG = MyApplication.class.getSimpleName();

    private static MyApplication mInstance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        Iconify
                .with(new FontAwesomeModule())
                .with(new MaterialModule())
                .with(new MaterialCommunityModule());
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

}
