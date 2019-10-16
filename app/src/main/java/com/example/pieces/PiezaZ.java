package com.example.pieces;

import android.graphics.Color;

public class PiezaZ extends Pieza3x3{

    public PiezaZ(int id, int color, int rows){
        super(id,color,rows);

        forma[0][1].activar();
        forma[0][2].activar();
        forma[1][0].activar();
        forma[1][1].activar();
    }
}
