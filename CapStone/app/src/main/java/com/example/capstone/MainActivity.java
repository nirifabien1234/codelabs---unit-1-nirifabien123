package com.example.capstone;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    int [] image ={R.drawable.food1, R.drawable.food2,
            R.drawable.food3, R.drawable.food4,
            R.drawable.food5, R.drawable.food6,
            R.drawable.food7, R.drawable.food9,
            R.drawable.food10, R.drawable.food11,
            R.drawable.food12, R.drawable.food13,
            R.drawable.food14, R.drawable.food1,};
    String[] foodname;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodname=getResources().getStringArray(R.array.food);
        GridView gridview = (GridView) findViewById(R.id.gridviewId);

        CustomerAdapter adapter= new CustomerAdapter(this,foodname,image);
        gridview.setAdapter(adapter);
    }
}