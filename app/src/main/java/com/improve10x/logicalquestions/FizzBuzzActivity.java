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
            String result = fizzBuzz(number);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    public static String fizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(n);
        }
        System.out.println(result);
        return result;
    }

}