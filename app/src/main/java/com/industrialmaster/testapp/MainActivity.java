package com.industrialmaster.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void blueBerry (View view){
        Intent intent = new Intent(MainActivity.this,BlueberryActivity.class);
        startActivity(intent);
    }
    public void chocolate (View view){
        Intent intent = new Intent(MainActivity.this,ChocolateCakeActivity.class);
        startActivity(intent);
    }
    public void strawberry (View view){
        Intent intent = new Intent(MainActivity.this,StrawberryActivity.class);
        startActivity(intent);
    }
}
