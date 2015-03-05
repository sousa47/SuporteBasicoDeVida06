package com.example.david.suportebasicodevida06;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class InfoListView extends FragmentActivity {

    private List<InfoButton> myButtons = new ArrayList<InfoButton>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        popularLista();
        popularListView();
        registerClickCallback();

    }

    private void registerClickCallback() {
        ListView lista = (ListView)findViewById(R.id.listViewInformacao);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicada, int position, long id) {

                /*
                InfoButton buttonClicado = myButtons.get(position);
                String messagem = "Ola tamos aqui na posicao: " + position
                        + " cujo coracao é " + buttonClicado.getNome();
                Toast.makeText(InfoListView.this, messagem, Toast.LENGTH_SHORT).show();*/

                Intent intent;

                if(position == 0)
                {
                    intent = new Intent(InfoListView.this, InfoSBV.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void popularListView() {
        ArrayAdapter<InfoButton> adapter = new MyListAdapter();
        ListView lista = (ListView)findViewById(R.id.listViewInformacao);
        lista.setAdapter(adapter);

    }


    private void popularLista()
    {
        myButtons.add(new InfoButton("Suporte Básico de vida",R.drawable.call));
        myButtons.add(new InfoButton("VOS",R.drawable.iconvos));
        myButtons.add(new InfoButton("Compressões Torácicas",R.drawable.iconcompressoes));

    }

    private class MyListAdapter extends ArrayAdapter<InfoButton> {
        public MyListAdapter()
        {
            super(InfoListView.this,R.layout.item_view,myButtons);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = convertView;
            if(itemView == null)
            {
                itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
            }

            InfoButton currentInfoButton = myButtons.get(position);

            ImageView imageView = (ImageView)itemView.findViewById(R.id.imageViewIdItem);
            imageView.setImageResource(currentInfoButton.getIconID());

            TextView textView = (TextView)itemView.findViewById(R.id.textViewNomeItem);
            textView.setText(currentInfoButton.getNome());

            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }
}
