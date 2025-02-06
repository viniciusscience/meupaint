/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintjava.gui;

import java.awt.Graphics;

/**
 *
 * @author vinicius
 */
public class Retangulo extends FormaGeometrica {

    @Override
    public void desenhar(Graphics g) {
        g = g.create();
        int xIniD = xInicial < xFinal ? xInicial : xFinal;
        int xFimD = xInicial < xFinal ? xFinal : xInicial;

        int yIniD = yInicial < yFinal ? yInicial : yFinal;
        int yFimD = yInicial < yFinal ? yFinal : yInicial;

        g.drawRect(xIniD, yIniD, xFimD - xIniD, yFimD - yIniD);

        g.dispose();

    }

}
