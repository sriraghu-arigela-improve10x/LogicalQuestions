package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityFourProgrammersBinding;
import com.improve10x.logicalquestions.databinding.ActivityIntegerRangeBinding;

public class FourProgrammersActivity extends AppCompatActivity {
    
    private ActivityFourProgrammersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = ActivityFourProgrammersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Four Programmers");
        findFourProgrammers();
    }

    private void findFourProgrammers() {
        binding.checkBtn.setOnClickListener(v -> {
            String paid1 = binding.paidoneTxt.getText().toString();
            int pay1 = Integer.parseInt(paid1);
            String  paid2 = binding.paidtwoTxt.getText().toString();
            int pay2 = Integer.parseInt(paid2);
            String paid3 = binding.paidthreeTxt.getText().toString();
            int pay3 = Integer.parseInt(paid3);
            String paid4 = binding.paidfourTxt.getText().toString();
            int pay4 = Integer.parseInt(paid4);
            int result = findFourProgrammers(pay1, pay2, pay3, pay4);
            String diffValue = String.valueOf(result);
            binding.valueTxt.setText(diffValue);
        });
    }

    public static int findFourProgrammers(int paid1, int paid2, int paid3, int paid4) {
        int diff;
        int max;
        int min;
        if (paid1 > paid2 && paid1 > paid3 && paid1 > paid4) {
            max = paid1;
            if (paid2 < paid3 && paid2 < paid4) {
                min = paid2;
            } else if (paid3 < paid4) {
                min = paid3;
            } else {
                min = paid4;
            }
        } else if (paid2 > paid3 && paid2 > paid4) {
            max = paid2;
            if (paid3 < paid4 && paid3 < paid1) {
                min = paid3;
            } else if (paid4 < paid1) {
                min = paid4;
            } else {
                min = paid1;
            }
        } else if (paid3 > paid4) {
            max = paid3;
            if (paid4 < paid1) {
                min = paid4;
            } else {
                min = paid1;
            }
        } else {
            max = paid4;
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