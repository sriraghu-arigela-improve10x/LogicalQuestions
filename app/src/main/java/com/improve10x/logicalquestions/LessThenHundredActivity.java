package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityLessThenHundredBinding;

public class LessThenHundredActivity extends AppCompatActivity {

    private ActivityLessThenHundredBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLessThenHundredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("LessThen100 Activity");
        findTheLessThenHundred();
    }

    private void findTheLessThenHundred() {
    }
}