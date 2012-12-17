package polytech.java.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FileCopieuse {

	public static void main(String []argvs)
	{
		//File f = new File("C:\\java\\");
		//System.out.println(f.getAbsolutePath()+ f.isDirectory());
		//return;
		
		if(argvs.length == 0)
		  new FileCopieuse();
		else if(argvs.length == 2)
		{
			FileCopieuse.copy(argvs[0], argvs[1]);
		}else{
			System.err.println("Syntax : java FileCopieuse <SourceFilePath> <DestinationFilePath>");
			System.exit(0);
		}
	}
	//"C:\Documents and Settings\Administrateur\Bureau\tp1.java  C:\Documents and Settings\Administrateur\Bureau\Java\new2.java
	private JFrame mainFrame = new JFrame("Hello!");
	private JPanel mainPanel = new JPanel();
	private JPanel subPanel1 = new JPanel();
	private JTextField txtSrc = new JTextField();
	private JButton btnSelect1 = new JButton("Parcourir...");
	
	private JPanel subPanel2 = new JPanel();
	private JTextField txtDest = new JTextField();
	private JButton btnSelect2 = new JButton("Parcourir...");
	private JButton btnCopier = new JButton("Copier"); 
	
	
	public FileCopieuse()
	{
		Dimension txtFieldDimension = new Dimension(250, 20);
		txtSrc.setPreferredSize(txtFieldDimension);
		txtDest.setPreferredSize(txtFieldDimension);
		
		subPanel1.setLayout(new FlowLayout());
		subPanel1.add(txtSrc);
		subPanel1.add(btnSelect1);
		
		subPanel2.setLayout(new FlowLayout());
		subPanel2.add(txtDest);
		subPanel2.add(btnSelect2);
		
		GridLayout grid = new GridLayout(3,1);
		mainPanel.setLayout(grid);//
		mainPanel.add(subPanel1);
		mainPanel.add(subPanel2);
		mainPanel.add(btnCopier);
		
		mainFrame.add(mainPanel);
		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);//Mettre la fenêtre au milieu de l'écran
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		btnSelect1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
//			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
//			        "JPG & GIF Images", "jpg", "gif");
//			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(mainFrame);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " +
			            chooser.getSelectedFile().getAbsolutePath());
			       txtSrc.setText(chooser.getSelectedFile().getAbsolutePath());
			    }
				
			}
		});
		
		//Destination
		btnSelect2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
			    int returnVal = chooser.showOpenDialog(mainFrame);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " +
			            chooser.getSelectedFile().getName());
			       txtDest.setText(chooser.getSelectedFile().getAbsolutePath());
			    }
				
			}
		});
		
		
		btnCopier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
					copy(txtSrc.getText(), txtDest.getText());
		}
		});
		
	}
	
	public static void copy(String srcPath, String destPath)
	{
		try{
			File src = new File(srcPath);
			File des = new File(destPath);
			if(!src.exists())
			{
				 JOptionPane.showMessageDialog(null, "The source file doesn't exist!", "Error", JOptionPane.ERROR_MESSAGE);
				 return;
			}
			if(src.isDirectory() && !des.isDirectory())
			{
				JOptionPane.showMessageDialog(null, "The destination needs to be a folder if the source is folder!", "Error", JOptionPane.ERROR_MESSAGE);
				 return;
			}
			else if(src.isDirectory())
			{
				String[]list = src.list();
				for(String s : list)
				{
					File fs = new File(s);
					if(fs.isDirectory())
					{
						copy(fs.getAbsolutePath(), destPath)
					}
				}
			}
			
			if(des.isDirectory())
			{
				des=new File(des.getAbsolutePath()+ File.separator + src.getName());
				System.out.println("des="+des);
			}
			if(des.exists())
			{
				 int choice = JOptionPane.showConfirmDialog(null, "The destination file already exists, do you want to replace it?");
				 if(choice == JOptionPane.CANCEL_OPTION)
					 return;
			}//des.createNewFile();
			
			
			
		
			
			
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(des);
			
			while(fis.available()>0)
			{
				fos.write(fis.read());
			}
			fis.close();
			fos.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
