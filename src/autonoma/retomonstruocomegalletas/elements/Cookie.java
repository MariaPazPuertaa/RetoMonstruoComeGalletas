/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retomonstruocomegalletas.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Maria Paz Puerta
 */
public class Cookie extends Sprite {
    private final Image imagen;
    public Cookie (int x, int y, int width, int height) {
        super(x, y, width, height, new Color(255, 215, 0));
        imagen = new ImageIcon(getClass().getResource("/autonoma/RetoMonstruoComeGalletas/images/Cookie.png")).getImage();
    }
    
    @Override
    public void draw(Graphics g) {
       g.drawImage(imagen, getX(), getY(), 100, 100, null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
    
}
