package com.ulas.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager= getSupportFragmentManager();
    FragmentTransaction fragmentTransaction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToFirst(View view){
       fragmentTransaction= fragmentManager.beginTransaction();
       FirstFragment firstFragment = new FirstFragment();
       //fragmentTransaction.add(R.id.frame_layout,firstFragment).commit();
        fragmentTransaction.replace(R.id.frame_layout,firstFragment).commit();
       
    }
    public void goToSecond(View view){
        fragmentTransaction= fragmentManager.beginTransaction();
        SecondFragment secondFragment = new SecondFragment();
        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();

    }
}