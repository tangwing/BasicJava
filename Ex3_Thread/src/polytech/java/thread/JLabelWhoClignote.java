package polytech.java.thread;

import java.awt.Color;

import javax.swing.JLabel;

public class JLabelWhoClignote extends JLabel implements Runnable{

	private Thread shine = null;
	private boolean isAlive = false;
	
	JLabelWhoClignote(String text)
	{
		super(text);
	}
	
	public void startShine()
	{
		if(isAlive == false)
		{
			
			isAlive = true;
			shine = new Thread(this);
			shine.start();
		}
	}
	public void stopShine()
	{
		if(shine !=null && shine.isAlive())
		{
			isAlive=false;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int rgb = 0;
		while(isAlive)
		{
			try{
				rgb += 100000;
				if(rgb > 16777210)rgb =0;
				this.setForeground(new Color(rgb));
				Thread.sleep(300);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}
