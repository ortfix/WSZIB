package pierwsze;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class Aplecik extends Applet {
	
	private Obiekt[] tab;
	
	@Override
	public void init() {
		setBackground(Color.blue);
		Dimension d = getSize();
		final int N = 10;
		tab = new Obiekt[N];
		for(int i = 0; i < N; i++)
			tab[i] = new Obiekt(d);
	}

	@Override
	public void paint(Graphics g) {
		for(Obiekt k : tab)
			k.rysuj(g);
	}

}
