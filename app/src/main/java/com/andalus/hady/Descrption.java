package com.andalus.hady;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Descrption extends AppCompatActivity {

    @BindView(R.id.name2)
    TextView Name;
    @BindView(R.id.size3)
    TextView Size;
    @BindView(R.id.descrption)
    TextView Desc;
    @BindView(R.id.image2)
    ImageView image;
    @BindView(R.id.Install)
    Button iNSTALL;

    Data[] data=MainActivity.fake;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descrption);
        ButterKnife.bind(this);

        int postion=getIntent().getIntExtra("postion",0);


        Name.setText(data[postion].getName());
        Size.setText(data[postion].getSize()+"MB");
        Desc.setText(data[postion].getDesc());
        image.setImageResource(data[postion].getImage());


    }
}
