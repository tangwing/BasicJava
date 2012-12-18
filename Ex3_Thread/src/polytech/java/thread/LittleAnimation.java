package polytech.java.thread;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class LittleAnimation extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String []argv)
	{
		new LittleAnimation();
	}
	
	private JFrame mainFrame = new JFrame("Hello!");
	private JPanel mainPanel = new JPanel();
	
	private JButton btnStartAnim = new JButton("Start");
	private JButton btnStopAnim = new JButton("Stop");
	private JButton btnStartShine = new JButton("Start shining");
	private JButton btnStopShine = new JButton("Stop shining");
	
	private JLabel lblHere = new JLabel("I'm here!");
	private JLabel lblThere = new JLabel("Now I'm here!");

	private JLabelWhoClignote myLabel = new JLabelWhoClignote("This is a shining label!");
	public LittleAnimation()
	{
		
		//mainPanel.setLayout(new FlowLayout());
		mainPanel.setLayout(new GridLayout(4, 2));
		lblHere.setHorizontalAlignment(SwingConstants.TRAILING);
		mainPanel.add(lblHere);
		lblThere.setHorizontalAlignment(SwingConstants.TRAILING);
		mainPanel.add(lblThere);
		mainPanel.add(btnStartAnim);
		mainPanel.add(btnStopAnim);

		//Test JLabelWhoShine
		mainPanel.add(myLabel);
		mainPanel.add(new JLabel());
		mainPanel.add(btnStartShine);
		mainPanel.add(btnStopShine);
		mainFrame.add(mainPanel);
		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);//Mettre la fenêtre au milieu de l'écran
		//mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Init state
		lblHere.setVisible(false);
		lblThere.setVisible(false);
		btnStopAnim.setEnabled(false);
		
		btnStartAnim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnStartAnim.setEnabled(false);
				btnStopAnim.setEnabled(true);
				new Thread(LittleAnimation.this).start();
			}
		});
		
		btnStopAnim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				btnStartAnim.setEnabled(true);
				btnStopAnim.setEnabled(false);
			}
		});
		
		btnStartShine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				myLabel.startShine();
			}
		});

		btnStopShine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				myLabel.stopShine();
			}
		});
		
		
		
	}

	@Override
	public void run() {
		while(btnStopAnim.isEnabled())
		{
			try {
				lblHere.setVisible(true);
				//lblHere.set
				Thread.sleep(500);
				lblThere.setVisible(true);
				//lblHere will lost his space because of FlowLayout. Try use Gridlayout
				lblHere.setVisible(false);
				Thread.sleep(500);
				lblThere.setVisible(false);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}