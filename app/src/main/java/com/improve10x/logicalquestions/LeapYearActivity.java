package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityLeapYearBinding;

public class LeapYearActivity extends AppCompatActivity {
    private ActivityLeapYearBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLeapYearBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Leap Year");
        findLeapYear();
    }

    private void findLeapYear() {
        binding.submitBtn.setOnClickListener(v -> {
            String year = binding.YearTxt.getText().toString();
            int years = Integer.parseInt(year);
            String leapYear = findTheLeapYear(years);
            binding.leapYearTxt.setText(leapYear);
        });
    }

    public static String findTheLeapYear(int leapYear) {
        String result = "";
        if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            result = "Leap Year";
        } else {
            result = "Common Year";
        }
        return result;
    }
}