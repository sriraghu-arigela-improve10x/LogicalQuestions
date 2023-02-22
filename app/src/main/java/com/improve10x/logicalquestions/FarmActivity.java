package com.improve10x.logicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalquestions.databinding.ActivityFarmBinding;

public class FarmActivity extends AppCompatActivity {

    private ActivityFarmBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFarmBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Farm Activity");
        findTheAnimalLegs();
    }
    private void findTheAnimalLegs() {
        binding.noofLegsBtn.setOnClickListener(v -> {
            String chickenLegs = binding.chickenLegs.getText().toString();
            String cowLegs = binding.cowLegs.getText().toString();
            String pigLegs = binding.pigLegs.getText().toString();
            int chickensLeg = Integer.parseInt(chickenLegs);
            int cowsLeg = Integer.parseInt(cowLegs);
            int pigsLeg = Integer.parseInt(pigLegs);
            int chickenLeg = chickensLeg * 2;
            int cowLeg = cowsLeg * 4;
            int pigLeg = pigsLeg * 4;
            int totalLegs = chickenLeg + cowLeg + pigLeg;
            String legs = String.valueOf(totalLegs);
            binding.totalLegs.setText(legs);

        });
    }
}