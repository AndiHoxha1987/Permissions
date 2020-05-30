package com.example.permissions;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simplePermission = findViewById(R.id.simple_permission_button);
        simplePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SimpleCheckPermission.class);
                startActivity(intent);
            }
        });

        Button dispatcherPermission = findViewById(R.id.dispatcher_permission_button);
        dispatcherPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PermissionsWithDispatcher.class);
                startActivity(intent);
            }
        });

        Button easyPermission = findViewById(R.id.easy_permission_button);
        easyPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EasyPermission.class);
                startActivity(intent);
            }
        });

        Button callPermission = findViewById(R.id.call_permission_button);
        callPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CallPermission.class);
                startActivity(intent);
            }
        });
    }

}