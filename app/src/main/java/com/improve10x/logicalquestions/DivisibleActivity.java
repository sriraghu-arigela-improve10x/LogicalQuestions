package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalquestions.databinding.ActivityDivisibleBinding;

public class DivisibleActivity extends AppCompatActivity {

    private ActivityDivisibleBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDivisibleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Divisible Activity");
        isDivisible();
    }

    private void isDivisible() {
        binding.checkBtn.setOnClickListener(v -> {
            String num = binding.divisibleTxt.getText().toString();
            int number = Integer.valueOf(num);
            boolean result = divisibleByFive(number);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    public static boolean divisibleByFive(int num) {
        boolean result = false;
        if (num % 5 == 0) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}