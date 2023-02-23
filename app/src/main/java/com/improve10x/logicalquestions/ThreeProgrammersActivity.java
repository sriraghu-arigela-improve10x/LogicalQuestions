package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityThreeProgrammersBinding;

public class ThreeProgrammersActivity extends AppCompatActivity {
    
    private ActivityThreeProgrammersBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThreeProgrammersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Three Programmers");
        findThreeProgrammers();
    }

    private void findThreeProgrammers() {
        binding.checkBtn.setOnClickListener(v -> {
            String paid1 = binding.paidoneTxt.getText().toString();
            int pay1 = Integer.parseInt(paid1);
            String  paid2 = binding.paidtwoTxt.getText().toString();
            int pay2 = Integer.parseInt(paid2);
            String paid3 = binding.paidthreeTxt.getText().toString();
            int pay3 = Integer.parseInt(paid3);
            int result = findThreeProgrammers(pay1, pay2, pay3);
            String diffValue = String.valueOf(result);
            binding.valueTxt.setText(diffValue);
        });
    }

    public static int findThreeProgrammers(int paid1, int paid2, int paid3) {
        int diff;
        int max;
        int min;
        if (paid1 > paid2 && paid1 > paid3) {
            max = paid1;
            if (paid2 < paid3) {
                min = paid2;
            } else {
                min = paid3;
            }
        } else if (paid2 > paid3) {
            max = paid2;
            if (paid1 < paid3) {
                min = paid1;
            } else {
                min = paid3;
            }
        } else {
            max = paid3;
            if (paid1 < paid2) {
                min = paid1;
            } else {
                min = paid2;
            }
        }
        diff = max - min;
        System.out.println(diff);
        return diff;
    }
}