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
    ImageView Image;
    @BindView(R.id.Install)
    Button iNSTALL;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descrption);
        ButterKnife.bind(this);

        Data data=getIntent().getParcelableExtra("item");

        int image=data.getImage();
        String name=data.getName();
        String desc=data.getDesc();
        int size=data.getSize();

        Name.setText(name);
        Size.setText(Integer.toString(size));
        Desc.setText(desc);
        Image.setImageResource(image);


    }
}
