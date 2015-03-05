package com.example.david.suportebasicodevida06;

/**
 * Created by david on 04/03/2015.
 */
public class InfoButton {

    private String nome; //nome
    private int iconID;  //id da imagem

    public InfoButton(String nome, int iconID) {
        this.nome = nome;
        this.iconID = iconID;
    }

    public int getIconID() {
        return iconID;
    }

    public String getNome() {
        return nome;
    }
}
