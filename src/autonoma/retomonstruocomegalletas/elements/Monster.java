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
public class Monster extends Sprite {
    public static final int STEP = 10;
    public static final int EAT_SIZE = 10;
    private Image imagen;
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Monster(int x, int y, int width, int height) {
        super(x, y, 200, 200, new Color(255, 182, 193));
        imagen = new ImageIcon(getClass().getResource("/autonoma/RetoMonstruoComeGalletas/images/Monster.png")).getImage();
        
    }

    @Override
    public void draw(Graphics g) {
         g.drawImage(imagen, getX(), getY(), getWidth(), getHeight(), null);
    }
    
    public void grow()
    {
        width += EAT_SIZE;
        height += EAT_SIZE;
    }
    
    public void shrink() {
        if (width > EAT_SIZE && height > EAT_SIZE) {  
            width -= EAT_SIZE;   
            height -= EAT_SIZE;
        }
    }
    
    public boolean hit(Cookie cookie) {
        return this.x < cookie.getX() + cookie.getWidth() &&
           this.x + this.width > cookie.getX() &&
           this.y < cookie.getY() + cookie.getHeight() &&
           this.y + this.height > cookie.getY();
    }
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
