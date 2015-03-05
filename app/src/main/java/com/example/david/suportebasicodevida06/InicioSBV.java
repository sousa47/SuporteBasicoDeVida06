package com.example.david.suportebasicodevida06;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class InicioSBV extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sbv);
    }

    public void OnClick(View v){
        Intent intent;
        intent = new Intent(v.getContext(), SBVFase1.class);
        startActivity(intent);
    }
}
