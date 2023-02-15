package com.basetechz.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.basetechz.demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Animation topAni,butAni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        topAni = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        butAni = AnimationUtils.loadAnimation(this,R.anim.buttom_animation);
        binding.appIcon.setAnimation(topAni);
        binding.appName.setAnimation(butAni);

        // create object of Handler class object
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}