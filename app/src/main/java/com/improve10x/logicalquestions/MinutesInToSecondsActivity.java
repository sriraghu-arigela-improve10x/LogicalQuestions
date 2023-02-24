package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityMinutesInToSecondsBinding;

public class MinutesInToSecondsActivity extends AppCompatActivity {
    
    private ActivityMinutesInToSecondsBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMinutesInToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("MinutesInTOSeconds");
        findConvertMinutesInToSeconds();
    }

    private void findConvertMinutesInToSeconds() {
        binding.submitBtn.setOnClickListener(v -> {
            String minutes = binding.minutesTxt.getText().toString();
            int mins = Integer.parseInt(minutes);
            int result = convertMinutesInToSeconds(mins);
            String seconds = String.valueOf(result);
            binding.secondsTxt.setText(seconds);
        });
    }

    private static int convertMinutesInToSeconds(int minutes) {
        int seconds;
        seconds = minutes * 60;
        System.out.println(seconds);
        return seconds;
    }
}