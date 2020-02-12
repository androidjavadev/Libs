package com.libs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.toast.MyMessage;
import com.toast.ToasttModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMessage.getMessage("Hello Library",this);

    }
}
