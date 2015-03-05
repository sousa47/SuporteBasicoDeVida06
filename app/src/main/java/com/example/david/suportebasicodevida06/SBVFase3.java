package com.example.david.suportebasicodevida06;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

public class SBVFase3 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbvfase3);
    }

    public void OnClick(View v){
        Intent intent;
        switch ( v.getId() )
        {
            case R.id.buttonFase3_1:
                intent = new Intent(v.getContext(), SBVFase3_1.class);
                break;
            default:
                intent = new Intent(v.getContext(), SBVFim.class);
        }

        startActivity(intent);
    }
}
