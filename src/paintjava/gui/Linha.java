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
public class Linha extends FormaGeometrica {

    @Override
    public void desenhar(Graphics g) {
        g = g.create();
        g.drawLine(xInicial, yInicial, xFinal, yFinal);
        g.dispose();
    }

}
