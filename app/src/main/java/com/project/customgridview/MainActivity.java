package com.project.customgridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {

    GridView gridview;

    public static String[] osNameList = {
            "icecream",
            "gingerbread",
            "honeycomb",
            "jellybean",
            "kitcat",
            "lolipop",};
    public static int[]
            osImages = {
            R.drawable.icecream,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.jellybean,
            R.drawable.kitcat,
            R.drawable.lolipop,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, osNameList, osImages));
    }
}