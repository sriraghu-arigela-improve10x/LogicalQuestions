package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityAgeToDaysBinding;

public class AgeToDaysActivity extends AppCompatActivity {
    
    private ActivityAgeToDaysBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAgeToDaysBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("AgeToDays");
        findAgeToDays();
    }

    private void findAgeToDays() {
        binding.submitBtn.setOnClickListener(v -> {
            String age = binding.ageTxt.getText().toString();
            int years = Integer.parseInt(age);
            int result = convertAgeToDays(years);
            String days = String.valueOf(result);
            binding.daysTxt.setText(days);
        });
    }

    public static int convertAgeToDays(int age) {
        int days = 0;
        days = age * 365;
        return days;
    }
}