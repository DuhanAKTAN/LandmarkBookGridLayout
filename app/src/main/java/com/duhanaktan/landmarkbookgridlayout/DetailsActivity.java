package com.duhanaktan.landmarkbookgridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.duhanaktan.landmarkbookgridlayout.databinding.ActivityDetailsBinding;
import com.duhanaktan.landmarkbookgridlayout.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();
        Landmark chosen=(Landmark) intent.getSerializableExtra("landmark");
        binding.cityText.setText(chosen.city);
        binding.imageView.setImageResource(chosen.image);
        binding.nameText.setText(chosen.name);
    }
}