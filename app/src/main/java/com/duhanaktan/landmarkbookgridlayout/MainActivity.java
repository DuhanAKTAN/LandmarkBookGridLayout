package com.duhanaktan.landmarkbookgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.duhanaktan.landmarkbookgridlayout.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList=new ArrayList<Landmark>();

        Landmark ayasofya=new Landmark("Ayasofya Camii","Istanbul",R.drawable.ayasofya);
        Landmark galata=new Landmark("Galata Kulesi","Istanbul",R.drawable.galata);
        Landmark kiz=new Landmark("Kız Kulesi","Istanbul",R.drawable.kizkule);
        Landmark peri=new Landmark("Peribacaları","Nevşehir",R.drawable.peribacasi);
        Landmark sumela=new Landmark("Sümela Manastırı","Trabzon",R.drawable.sumela);
        Landmark traverten=new Landmark("Pamukkale Travertenleri","Pamukkale",R.drawable.traverten);

        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(kiz);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(peri);
        landmarkArrayList.add(sumela);
        landmarkArrayList.add(traverten);


        binding.recycleText.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recycleText.setAdapter(landmarkAdapter);

    }
}