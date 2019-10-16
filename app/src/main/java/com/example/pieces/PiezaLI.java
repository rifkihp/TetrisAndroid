package com.example.pieces;

import android.graphics.Color;

public class PiezaLI extends Pieza3x3{ //L inversa

    public PiezaLI(int id, int color, int rows){
        super(id, color,rows);

        //Colocar las piezas
        forma[0][1].activar();
        forma[1][1].activar();
        forma[2][1].activar();
        forma[2][0].activar();
    }
}
