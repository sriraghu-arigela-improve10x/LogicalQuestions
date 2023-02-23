package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityEqalityOfThreeValuesBinding;

public class EqualityOfThreeValuesActivity extends AppCompatActivity {

    private ActivityEqalityOfThreeValuesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEqalityOfThreeValuesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Equality Value");
        findEqualityOfThreeValues();
    }

    private void findEqualityOfThreeValues() {
        binding.valueBtn.setOnClickListener(v -> {
            String firstValue = binding.firstValueTxt.getText().toString();
            int first = Integer.parseInt(firstValue);
            String secondValue = binding.secondValueTxt.getText().toString();
            int second = Integer.parseInt(secondValue);
            String thirdValue = binding.thirdValueTxt.getText().toString();
            int third = Integer.parseInt(thirdValue);
            int result = findEqualityOfThreeValues(first, second, third);
            String values = String.valueOf(result);
            binding.equqlityValueTxt.setText(values);

        });
    }

    public static int findEqualityOfThreeValues(int a, int b, int c) {
        int equalityValue = 0;
        if (a == b && b == c) {
            equalityValue = 3;
        } else if (a == b || b == c || a == c) {
            equalityValue = 2;
        } else {
            equalityValue = 0;
        }
        return equalityValue;
    }
}