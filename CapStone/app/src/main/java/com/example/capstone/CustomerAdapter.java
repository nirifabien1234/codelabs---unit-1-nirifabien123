package com.example.capstone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class CustomerAdapter extends BaseAdapter {
   Context context;
   int[] image;
   String [] foodname;


    CustomerAdapter(Context context,String[]foodname,int[]image){
       this.context= context;
       this.foodname=foodname;
       this.image=image;

   }
    public int getCount() {

        return foodname.length;
    }

    public Object getItem(int position) {

        return null;
    }

    public long getItemId(int position) {

        return 0;
    }





    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

           view= inflater.inflate(R.layout.single_view, viewGroup,false);

        }
        ImageView imageView=(ImageView) view.findViewById(R.id.ImageviewId);
        TextView textView =(TextView)view.findViewById(R.id.textviewId);
        imageView.setImageResource(image[position]);
        textView.setText(foodname[position]);
        return view;
    }
}
