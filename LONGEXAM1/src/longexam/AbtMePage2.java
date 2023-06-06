package longexam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AbtMePage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbtMePage2 frame = new AbtMePage2();
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
	public AbtMePage2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//this textpane contains the information about myself
		JTextPane txtpnFullNameDerek = new JTextPane();
		txtpnFullNameDerek.setText(" Full Name: Derek Convicto Honrubia\r\n Age: 18 Years Old\r\n Birth Date: June 15, 2004\r\n Birth Place: Quezon City\r\n\r\n EDUCATION\r\n Elementary: Camarilla Elementary School\r\n Junior & Senior High School: Camp General\r\n Emilio Aguinalo High School\r\n\r\n LIKES:                                         Contact Number:\r\n • Donuts                                    +639165648898\r\n • Anime                                     EMAIL: \r\n • Kpop/KDrama                          derekhonrubia04@gmail.com\r\n • Online Gaming          \r\n\r\n DISLIKES:\r\n • Eggplants\r\n • Dolls\r\n • Groupmates who don't contribute\r\n");
		txtpnFullNameDerek.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		txtpnFullNameDerek.setBounds(102, 197, 455, 284);
		contentPane.add(txtpnFullNameDerek);
		
		// this is a label/button that puts the user in the previous page when pressed
		JLabel AbtMeBackLbl = new JLabel("");
		AbtMeBackLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AbtMePage1 abt1 = new AbtMePage1();
				abt1.setVisible(true);
				dispose();
			}
		});
		
		
		AbtMeBackLbl.setBounds(54, 430, 51, 51);
		contentPane.add(AbtMeBackLbl);
		
		//this contains the background of the page
		JLabel NewAbtMeBack2 = new JLabel("");
		NewAbtMeBack2.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\NewAbtMeBack2.png"));
		NewAbtMeBack2.setBounds(0, 0, 886, 511);
		contentPane.add(NewAbtMeBack2);
		
	}

}
