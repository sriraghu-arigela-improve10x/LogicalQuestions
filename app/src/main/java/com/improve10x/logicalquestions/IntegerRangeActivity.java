package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityIntegerRangeBinding;

public class IntegerRangeActivity extends AppCompatActivity {

    private ActivityIntegerRangeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntegerRangeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Integer Activity");
        findIntegerRange();
    }

    private void findIntegerRange() {
        binding.intRangeBtn.setOnClickListener(v -> {
            String input = binding.nTxt.getText().toString();
            int n = Integer.parseInt(input);
            String lowerCase = binding.lowerCaseText.getText().toString();
            int lowerNum = Integer.parseInt(lowerCase);
            String upperCase = binding.upperCaseTxt.getText().toString();
            int upperNum = Integer.parseInt(upperCase);
            boolean result = findIntegerRange(n,lowerNum,upperNum);
            String range = String.valueOf(result);
            binding.rangeTxt.setText(range);
        });
    }

    public static boolean findIntegerRange(int n, int lower, int upper) {
        boolean result = false;
        if (n >= lower && n < upper) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}