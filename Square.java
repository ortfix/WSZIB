package Bartosz_Wojcik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class Square {

	private int a;
	private int x,y;
	
	public Square(Dimension d) {
		Random gen = new Random();
				
		int min_a = 10;
		int max_a = Math.min(d.width, d.height) / 3; 
		a = min_a + gen.nextInt(max_a-min_a); 
		
		x = gen.nextInt(d.width - a);
		y = gen.nextInt(d.height - a);
	}

	public void rysuj(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, a, a);
	}
	
	
}
