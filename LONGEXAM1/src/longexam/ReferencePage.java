package longexam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReferencePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReferencePage frame = new ReferencePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReferencePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		//this label/button will take the user to the designated previous page when clicked
		JLabel refBackBtn = new JLabel("");
		refBackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StartUpPage strt = new StartUpPage();
				strt.setVisible(true);
				dispose();
			}
		});
		refBackBtn.setBounds(51, 437, 60, 46);
		contentPane.add(refBackBtn);
		
    //this contains the background of the page/class
		JLabel ReferencesBackGround = new JLabel("");
		ReferencesBackGround.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\ReferencesBack.png"));
		ReferencesBackGround.setBounds(0, 0, 908, 526);
		contentPane.add(ReferencesBackGround);
		
    //this button/label will dispose the program
		JLabel trashBtn = new JLabel("");
		trashBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		trashBtn.setBounds(825, 37, 38, 58);
		contentPane.add(trashBtn);
		
	}
}
