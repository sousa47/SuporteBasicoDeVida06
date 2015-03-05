package com.example.david.suportebasicodevida06;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class SBVFase1 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbvfase1);
    }

    public void OnClick(View v){
        Intent intent;
        switch ( v.getId() )
        {
            case R.id.buttonFase1_1:
                intent = new Intent(v.getContext(), SBVFase1_1.class);
                break;
            default:
                intent = new Intent(v.getContext(), SBVFase2.class);
        }

        startActivity(intent);
    }
}
