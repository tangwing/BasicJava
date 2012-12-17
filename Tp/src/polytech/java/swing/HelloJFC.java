package polytech.java.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
public class HelloJFC {

	public static void main(String []argv)
	{
		new HelloJFC();
	}
	
	private JFrame mainFrame = new JFrame("Hello!");
	private JPanel mainPanel = new JPanel();
	private JButton btnAppuyer = new JButton("Appuie!");
	private JButton btnQuiter = new JButton("Quite!");
	private JLabel lblTimes = new JLabel("0");

	private int times = 0;
	public HelloJFC() 
	{
		mainPanel.setLayout(new FlowLayout());
		btnAppuyer.setBorder(new EmptyBorder(20, 20, 20 ,20));
		mainPanel.add(btnAppuyer);
		lblTimes.setPreferredSize(new Dimension(30, 15));//LayoutManager s'intéresse qu'au preferredsize, setSize() ne marche pas ici...
		lblTimes.setHorizontalAlignment(SwingConstants.TRAILING);
		mainPanel.add(lblTimes);
		mainPanel.add(btnQuiter);
		mainFrame.add(mainPanel);
		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);//Mettre la fenêtre au milieu de l'écran
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		btnAppuyer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				times++;
				lblTimes.setText(times+"");
				System.out.println(times);
				
			}
		});
		
		btnQuiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
