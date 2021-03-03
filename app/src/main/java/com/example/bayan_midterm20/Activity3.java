package com.example.bayan_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        String[] restaurants = {"Mac",
                "subway",
                "kodu",
                "herfy",
                "basken robenz"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_3, R.id.item,restaurants));

        Button act1 =(Button)findViewById(R.id.act1F3);
        Button act2 =(Button)findViewById(R.id.act2F3);


        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this,MainActivity.class));
            }
        });
        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this,Activity2.class));
            }
        });
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Activity3.this,mac.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.subway.com/ar-sa")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kudu.com.sa/home")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.herfy.com/")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baskinrobbinsmea.com/en/")));
                break;
        }
    }
    }
