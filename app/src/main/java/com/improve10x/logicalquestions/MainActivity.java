package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.logicalquestions.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findTheLegs();
        isFindFizzBuzz();
        isDivisible();
        nThEvenNumber();
        findDiscount();
        findIntegerRange();
        findLessThenHundred();
        findEqualityOfThreeValues();
        findThreeProgrammers();
        findFourProgrammers();
        isFindTheBomb();
        findTwoMakesTen();
        findConvertMinutesInToSeconds();
        findConvertHoursAndMinutesInToSeconds();
        convertAgeToDays();
        findTheLeapYear();
    }

    private void findTheLeapYear() {
        binding.leapYearBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LeapYearActivity.class);
            startActivity(intent);
        });
    }

    private void findTheLegs() {
        binding.farmBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, FarmActivity.class);
            startActivity(intent);
        });
    }

    private void isFindFizzBuzz() {
        binding.fizzBuzzBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FizzBuzzActivity.class);
            startActivity(intent);
        });
    }

    private void isDivisible() {
        binding.divisibleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleActivity.class);
            startActivity(intent);
        });
    }

    private void nThEvenNumber() {
        binding.nthEvenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NthEvenNumberActivity.class);
            startActivity(intent);
        });
    }

    private void findDiscount() {
        binding.discBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DiscountActivity.class);
            startActivity(intent);
        });
    }

    private void findIntegerRange() {
        binding.intBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, IntegerRangeActivity.class);
            startActivity(intent);
        });
    }

    private void findLessThenHundred() {
        binding.lessthenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, LessThenHundredActivity.class);
            startActivity(intent);
        });
    }

    private void findEqualityOfThreeValues() {
        binding.equalityBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, EqualityOfThreeValuesActivity.class);
            startActivity(intent);
        });
    }

    private void findThreeProgrammers() {
    binding.threePgrmsBtn.setOnClickListener(v -> {
        Intent intent = new Intent(this, ThreeProgrammersActivity.class);
        startActivity(intent);
    });
    }

    private void findFourProgrammers() {
        binding.fourPgrmsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FourProgrammersActivity.class);
            startActivity(intent);
        });
    }

    private void isFindTheBomb() {
        binding.bombBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindTheBombActivity.class);
            startActivity(intent);
        });
    }

    private void findTwoMakesTen() {
        binding.twoMakesBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoMakesTenActivity.class);
            startActivity(intent);
        });
    }

    private void findConvertMinutesInToSeconds() {
        binding.convertBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MinutesInToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void findConvertHoursAndMinutesInToSeconds() {
        binding.convertSecondsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, HoursAndMinutesIntoSecondActivity.class);
            startActivity(intent);
        });
    }

    private void convertAgeToDays() {
        binding.ageToDaysBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, AgeToDaysActivity.class);
            startActivity(intent);
        });
    }
}