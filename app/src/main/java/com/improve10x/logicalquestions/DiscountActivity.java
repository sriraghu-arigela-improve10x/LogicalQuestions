package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityDiscountBinding;

public class DiscountActivity extends AppCompatActivity {
    private ActivityDiscountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Discount Activity");
        findDiscount();
    }

    private void findDiscount() {
        binding.calculateBtn.setOnClickListener(v -> {
            String price = binding.priceTxt.getText().toString();
            int number = Integer.parseInt(price);
            String discount = binding.discountTxt.getText().toString();
            int disc = Integer.parseInt(discount);
            double discountPrice = findDiscount(number, disc);
            String finalPrice = String.valueOf(discountPrice);
            binding.finalPriceTxt.setText(finalPrice);
        });
    }

    public static double findDiscount(int price, int percentage) {
        double finalPrice = 0;
        double discountAmount = 0;
        discountAmount = price * percentage / 100;
        finalPrice = price - discountAmount;
        System.out.println(finalPrice);
        return finalPrice;
    }
}