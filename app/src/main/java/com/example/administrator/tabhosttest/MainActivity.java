package com.example.administrator.tabhosttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.TabActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tab1=tabHost.newTabSpec("tab1")
                .setIndicator("already receive")
                .setContent(R.id.tab01);
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2=tabHost.newTabSpec("tab2")
                .setIndicator("already call",getResources()
                .getDrawable(R.mipmap.ic_launcher))
                .setContent(R.id.tab02);
        TabHost.TabSpec tab3=tabHost.newTabSpec("tab3")
                .setIndicator("unreceive")
                .setContent(R.id.tab03);
        tabHost.addTab(tab3);

    }
}
