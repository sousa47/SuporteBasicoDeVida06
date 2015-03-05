package com.example.david.suportebasicodevida06;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;


public class SBVFase2 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbvfase2);
    }

    public void OnClick(View v){
        Intent intent;
        intent = new Intent(v.getContext(), SBVFase3.class);
        startActivity(intent);
    }
}
