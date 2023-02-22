package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityNthEvenNumberBinding;

public class NthEvenNumberActivity extends AppCompatActivity {

    private ActivityNthEvenNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNthEvenNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Nth EvenActivity");
        nThEvenNumber();
    }

    private void nThEvenNumber() {
        binding.calculateBtn.setOnClickListener(v -> {
            String evenNumber = binding.evenNumber.getText().toString();
            int nEvenNumber = Integer.parseInt(evenNumber);
            int result = nThEvenNumber(nEvenNumber);
            String number = String.valueOf(result);
            binding.nthEvenNumberTxt.setText(number);
        });
    }

    public static int nThEvenNumber(int n) {
        int evenNumber;
        evenNumber = 2 * (n - 1);
        System.out.println(evenNumber);
        return evenNumber;

        // 1 2 3 4 5  6  7  8  9 10 - nth value
    }   // 0 2 4 6 8 10 12 14 16 18 -evenNumbers
}