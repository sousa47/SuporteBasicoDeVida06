package com.example.david.suportebasicodevida06;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Controlo so swipe
        ViewPager viewPager = (ViewPager) findViewById(R.id.activitymainfragments);

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fragmentManager));
        viewPager.setCurrentItem(1);
    }

    public void OnClick(View v){
        Intent intent;
        switch ( v.getId() )
        {
            case R.id.buttonSBV:
                intent = new Intent(v.getContext(), InicioSBV.class);
                break;
            default:
                intent = new Intent(v.getContext(), InfoListView.class);
        }

        startActivity(intent);
    }

}
