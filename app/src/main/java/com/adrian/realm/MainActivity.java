package com.adrian.realm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.adrian.realm.viewmodel.TareasAppViewModel;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    private TareasAppViewModel tareasAppViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm.init(this);
        setContentView(R.layout.activity_main);
        tareasAppViewModel = ViewModelProviders.of(this).get(TareasAppViewModel.class);
    }

    @Override
    public void onBackPressed() {
        tareasAppViewModel.isUserEditing = false;
        super.onBackPressed();
    }
}
