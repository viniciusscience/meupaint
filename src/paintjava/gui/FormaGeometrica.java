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
public abstract class FormaGeometrica {

    protected int xInicial;
    protected int yInicial;
    protected int xFinal;
    protected int yFinal;
    
   abstract void desenhar(Graphics g);
   
   
    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }

 
}
