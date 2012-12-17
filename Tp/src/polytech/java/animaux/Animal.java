package polytech.java.animaux;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Animal {

	Color color;
	int posX, posY, sizeX, sizeY;
	
	abstract void dessiner( Graphics g);
	
}
