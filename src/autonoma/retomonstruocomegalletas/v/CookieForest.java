/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.retomonstruocomegalletas.v;

import autonoma.retomonstruocomegalletas.elements.Cookie;
import autonoma.retomonstruocomegalletas.elements.Monster;
import autonoma.retomonstruocomegalletas.elements.Sprite;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Maria Paz Puerta
 */
public class CookieForest extends Sprite {
    private Monster monster;
    private ArrayList<Cookie> cookies = new ArrayList<>();
    
    public CookieForest (int x, int y, int width, int height)
    {
        super(x, y, width, height, new Color(34, 139, 34));
        monster = new Monster(100, 100, 50, 50);
        
    }

    @Override
    public void draw(Graphics g) {
        
        g.setColor(color);
        g.fillRect(x, y, width, height);
        
        monster.draw(g);
        
        for(Cookie cookie : cookies){
            cookie.draw(g);
        }
       
    }
}
