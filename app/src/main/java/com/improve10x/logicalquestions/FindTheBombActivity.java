package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityFindTheBombBinding;

public class FindTheBombActivity extends AppCompatActivity {

    private ActivityFindTheBombBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTheBombBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Find The Bomb");
        isFindTheBomb();
    }

    private void isFindTheBomb() {
        binding.findBtn.setOnClickListener(v -> {
            String input = binding.inputTxt.getText().toString();
            String result = findTheBomb(input);
            binding.resultTxt.setText(result);
        });
    }

    public static String findTheBomb(String text) {
        try {
            String result = "";
            String textInLowerCase = text.toLowerCase();
            if (textInLowerCase.contains("bomb")) {
                result = "DUCK!";
            } else {
                result = "Relax, there's no bomb.";
            }
            return result;
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}