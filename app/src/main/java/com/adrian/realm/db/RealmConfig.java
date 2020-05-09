package com.adrian.realm.db;

import android.app.Application;

import io.realm.Realm;

public class RealmConfig extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}