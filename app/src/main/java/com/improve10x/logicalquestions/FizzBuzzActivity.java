package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalquestions.databinding.ActivityFizzBuzzBinding;

public class FizzBuzzActivity extends AppCompatActivity {

    private ActivityFizzBuzzBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFizzBuzzBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("FizzBuzz Activity");
        isFindBuzz();
    }

    private void isFindBuzz() {
        binding.checkBtn.setOnClickListener(v -> {
            String num = binding.numberTxt.getText().toString();
            int number = Integer.valueOf(num);
            if ( number % 3 == 0 &&  number % 5 == 0) {
                Toast.makeText(this, "FizzBuzz", Toast.LENGTH_SHORT).show();
            } else if (number % 3 == 0) {
                Toast.makeText(this, "Fizz", Toast.LENGTH_SHORT).show();
            } else if (number % 5 == 0) {
                Toast.makeText(this, "Buzz", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, String.valueOf(number), Toast.LENGTH_SHORT).show();
            }
        });
    }
}