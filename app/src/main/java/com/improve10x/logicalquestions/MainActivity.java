package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findTheLegs();
        isFindFizzBuzz();
        isDivisible();

    }

    private void findTheLegs() {
        binding.farmBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, FarmActivity.class);
            startActivity(intent);
        });
    }

    private void isFindFizzBuzz() {
        binding.fizzBuzzBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FizzBuzzActivity.class);
            startActivity(intent);
        });
    }

    private void isDivisible() {
        binding.divisibleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleActivity.class);
            startActivity(intent);
        });
    }
}