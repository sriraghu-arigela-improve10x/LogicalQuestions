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
        binding.findBtn.setOnClickListener(v -> {
            String number1 = binding.number1Txt.getText().toString();
            int num1 = Integer.parseInt(number1);
            String number2 = binding.number2Txt.getText().toString();
            int num2 = Integer.parseInt(number2);
            boolean result = lessThan100(num1,num2);
            String value = String.valueOf(result);
            binding.lessthenTxt.setText(value);
        });
    }

    public static boolean lessThan100(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if (sum < 100) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}