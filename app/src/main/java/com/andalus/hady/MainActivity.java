package com.andalus.hady;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity  {
    public static Data[] fake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.Recycle1);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        fake =  new Data[]{
                new Data("Youtube",70,R.drawable.youtube,"Watch videos from all over the world"),
                new Data("Instagram",60,R.drawable.instagram,"share your videos and photos with your friends"),
                new Data("Itunes",50,R.drawable.itunes,"Listen the Music"),
                new Data("kik",70,R.drawable.kik,"Social with Kik"),
                new Data("Skype",55,R.drawable.skype,"Video calls "),
                new Data("Linkedin",70,R.drawable.linkedin,"Social Work Network"),
                new Data("Messenger",70,R.drawable.messenger,"Message your friends on faceook"),
                new Data("Reddit",70,R.drawable.reddit,"Read Helpful Articles"),
                new Data("Whatsapp",70,R.drawable.whatsapp,"Talk to your friends just add their Number"),
                new Data("Youtube",70,R.drawable.youtube,"Watch videos from all over the world"),
                new Data("Instagram",60,R.drawable.instagram,"share your videos and photos with your friends"),
                new Data("Itunes",50,R.drawable.itunes,"Listen the Music"),
                new Data("kik",70,R.drawable.kik,"Social with Kik"),
                new Data("Skype",55,R.drawable.skype,"Video calls "),
                new Data("Linkedin",70,R.drawable.linkedin,"Social Work Network"),
                new Data("Messenger",70,R.drawable.messenger,"Message your friends on faceook"),
                new Data("Reddit",70,R.drawable.reddit,"Read Helpful Articles"),
                new Data("Whatsapp",70,R.drawable.whatsapp,"Talk to your friends just add their Number"),






        };

        recyclerView.setAdapter(new Adapter(fake, new Adapter.ListItemOnClickListiner() {
            @Override
            public void onlistitemclick(int ClickedItemIndex) {
                Intent go=new Intent(MainActivity.this,Descrption.class);
                go.putExtra("postion",ClickedItemIndex);
                startActivity(go);


            }
        }));





    }


}
