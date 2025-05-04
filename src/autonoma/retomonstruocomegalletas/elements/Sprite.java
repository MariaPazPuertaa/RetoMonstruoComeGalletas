/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retomonstruocomegalletas.elements;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Maria Paz Puerta
 */
public abstract class Sprite {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Color color;

    public Sprite(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public abstract void draw(Graphics g);
    
}
