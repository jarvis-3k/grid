package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridView gridView;

String[] word={"vlc","CCleaner","Visual","7zip"};
int[] image = {R.drawable.vlc,R.drawable.ccleaner,R.drawable.visual,R.drawable.zip};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid);

        MainAdapter adapter = new MainAdapter(MainActivity.this,word,image);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked" +word[+position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}