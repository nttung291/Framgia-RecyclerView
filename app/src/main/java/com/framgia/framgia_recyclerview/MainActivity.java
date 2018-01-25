package com.framgia.framgia_recyclerview;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<HeroModel> heroModels = new ArrayList<>();
    private HeroModel heroModel;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        setUI();
    }

    private void setUI() {
        RecyclerView recyclerView = findViewById(R.id.rv_hero);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HeroAdapter adapter = new HeroAdapter(this,heroModels);
        recyclerView.setAdapter(adapter);
    }

    public void loadData(){
        heroModel = new HeroModel("Black Panther","drawable/blackpanther");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Black Widow","drawable/blackwidow");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Captain America","drawable/captainamerica");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Captain Marvel","drawable/captianmarvel");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Black Panther","drawable/blackpanther");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Black Widow","drawable/blackwidow");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Captain America","drawable/captainamerica");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Captain Marvel","drawable/captianmarvel");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Black Panther","drawable/blackpanther");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Black Widow","drawable/blackwidow");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Captain America","drawable/captainamerica");
        heroModels.add(heroModel);
        heroModel = new HeroModel("Captain Marvel","drawable/captianmarvel");
        heroModels.add(heroModel);

    }
}
