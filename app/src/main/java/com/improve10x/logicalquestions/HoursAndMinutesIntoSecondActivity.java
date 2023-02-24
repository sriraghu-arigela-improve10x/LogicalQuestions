package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityHoursAndMinutesIntoSecondBinding;

public class HoursAndMinutesIntoSecondActivity extends AppCompatActivity {

    private ActivityHoursAndMinutesIntoSecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHoursAndMinutesIntoSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("HrsAndMnsInToSeconds");
        findHoursAndMinutesIntoSeconds();
    }

    private void findHoursAndMinutesIntoSeconds() {
        binding.submitBtn.setOnClickListener(v -> {
            String hours = binding.hoursTxt.getText().toString();
            int hrs = Integer.parseInt(hours);
            String minutes = binding.minutesTxt.getText().toString();
            int mins = Integer.parseInt(minutes);
            int result = findConvertHoursIntoMinutes(hrs, mins);
            String seconds = String.valueOf(result);
            binding.secondsTxt.setText(seconds);
        });

    }

    public static int findConvertHoursIntoMinutes(int hours, int minutes) {
        int seconds;
        seconds = (hours * 3600) + (minutes * 60);
        System.out.println(seconds);
        return seconds;
    }
}