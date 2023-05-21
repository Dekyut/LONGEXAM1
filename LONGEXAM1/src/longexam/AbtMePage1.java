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
		
		
		JTextPane AbtMeTxtPane1 = new JTextPane();
		AbtMeTxtPane1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		AbtMeTxtPane1.setText("I am a first-year college student at National University who is a dedicated, hardworking, and creative individual with the goal of creating work and class atmospheres comfortable and fun as well as finishing tasks on time with the utmost greatest quality I can make.");
		AbtMeTxtPane1.setBounds(100, 214, 455, 218);
		contentPane.add(AbtMeTxtPane1);
		
		JLabel AbtMeBackground = new JLabel("New label");
		AbtMeBackground.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\AbtMeBack1.png"));
		AbtMeBackground.setBounds(0, 0, 905, 511);
		contentPane.add(AbtMeBackground);
		
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
	}
}
