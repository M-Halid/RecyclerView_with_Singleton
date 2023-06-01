package com.ewig.recyclerviewactivities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ewig.recyclerviewactivities.databinding.ActivityDetails2Binding;

public class Details2 extends AppCompatActivity {

    private ActivityDetails2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        /*Intent intent =getIntent();
        LandMark clickedLandmark = (LandMark) intent.getSerializableExtra("landmark");
*/
        Singleton singleton=Singleton.getInstance();
        LandMark clickedLandmark =(LandMark) singleton.getSentLandMark();

        String cityCountry=clickedLandmark.city+ ", "+ clickedLandmark.country;

        binding.Name.setText(clickedLandmark.name);
        binding.CityAndCountry.setText(cityCountry);
        binding.Image.setImageResource(clickedLandmark.image);

    }
}