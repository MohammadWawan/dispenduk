package com.example.siapel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_activity);

        ImageSlider imageSlider= findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-Njv0pYX0xeI/W2MhKOyffjI/AAAAAAAACj4/MQLLzqm30AwbfMlByKyck9psB6vn_QIYwCLcBGAs/s640/IMG-20180802-WA0445.jpg","Dispenduk Kota Malang"));
        slideModels.add(new SlideModel("https://cdns.klimg.com/newshub.id/news/2017/01/05/113557/750x500-tenaga-outsourcing-ditarik-layanan-kependudukan-di-kota-malang-kacau-170105x.jpg","Dispenduk Kota Malang"));
        slideModels.add(new SlideModel("https://bangsaonline.com/images/uploads/berita/700/5f40816a32ee830229e8fe348c3f0b54.jpg","Dispenduk Kota Malang"));
        slideModels.add(new SlideModel("https://www.klikapa.com/images/2020-12-089-12-adm-dikcapil.jpg","Dispenduk Kota Malang"));
        imageSlider.setImageList(slideModels,true);
    }
}