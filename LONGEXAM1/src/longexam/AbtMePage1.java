package longexam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AbtMePage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbtMePage1 frame = new AbtMePage1();
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
	public AbtMePage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// this puts a text panel where I can put my information
		JTextPane AbtMeTxtPane1 = new JTextPane();
		AbtMeTxtPane1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		AbtMeTxtPane1.setText("I am a first-year college student at National University who is a dedicated, hardworking, and creative individual with the goal of creating work and class atmospheres comfortable and fun as well as finishing tasks on time with the utmost greatest quality I can make.");
		AbtMeTxtPane1.setBounds(100, 214, 455, 218);
		contentPane.add(AbtMeTxtPane1);
		
		//this a label/button that will take the user to the previous page
		JLabel AbtMe1BackLbl = new JLabel("");
		AbtMe1BackLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StartUpPage stp = new StartUpPage();
				stp.setVisible(true);
				dispose();
			}
		});
		AbtMe1BackLbl.setBounds(45, 431, 63, 53);
		contentPane.add(AbtMe1BackLbl);
		
		//this label/button will take the user to the next page
		JLabel AbtMe1NextLbl = new JLabel("");
		AbtMe1NextLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AbtMePage2 abt2 = new AbtMePage2();
				abt2.setVisible(true);
				dispose();
			}
		});
		AbtMe1NextLbl.setBounds(786, 431, 63, 53);
		contentPane.add(AbtMe1NextLbl);
		
		//this contains the background of the design
		JLabel AbtMeBack1 = new JLabel("");
		AbtMeBack1.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\NewAbtMeBack.png"));
		AbtMeBack1.setBounds(0, 0, 886, 511);
		contentPane.add(AbtMeBack1);
	}
}
