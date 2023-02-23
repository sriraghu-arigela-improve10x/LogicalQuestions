package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityTwoMakesTenBinding;

public class TwoMakesTenActivity extends AppCompatActivity {

    private ActivityTwoMakesTenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoMakesTenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Two Makes Ten");
        findTwoMakesTen();
    }

    private void findTwoMakesTen() {
    }

    public static boolean findTwoMakesTen(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}