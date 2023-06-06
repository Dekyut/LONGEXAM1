package longexam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class StartUpPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUpPage frame = new StartUpPage();
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
	public StartUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//this label/button will take the user to the designated ArtGallery page/class when clicked
		JLabel ArtGalleryBtn = new JLabel("");
		ArtGalleryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArtGallery1 art1 = new ArtGallery1();
				art1.setVisible(true);
				dispose();
			}
		});
		ArtGalleryBtn.setBounds(64, 177, 283, 196);
		contentPane.add(ArtGalleryBtn);
		
		//this label/button will take the user to the designated About Me page/class when clicked
		JLabel AboutMeBtn = new JLabel("");
		AboutMeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AbtMePage1 abt1 = new AbtMePage1();
				abt1.setVisible(true);
				dispose();
			}
		});
		AboutMeBtn.setBounds(357, 258, 234, 205);
		contentPane.add(AboutMeBtn);
		
		//this label/button will take the user to the designated Skills & Expertise page/class when clicked
		JLabel SkillsExpBtn = new JLabel("");
		SkillsExpBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SkillsExpPage ske = new SkillsExpPage();
				ske.setVisible(true);
				dispose();
			}
		});
		SkillsExpBtn.setBounds(630, 152, 226, 221);
		contentPane.add(SkillsExpBtn);
		
		//this label/button will take the user to the designate previous page when clicked
		JLabel BackBtn = new JLabel("");
		BackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StartUpPage0 start = new StartUpPage0();
				start.setVisible(true);
				dispose();
			}
		});
		BackBtn.setBounds(52, 413, 56, 62);
		contentPane.add(BackBtn);
		
		JLabel WhiteErase = new JLabel("");
		WhiteErase.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\white.jpg"));
		WhiteErase.setBounds(786, 413, 61, 55);
		contentPane.add(WhiteErase);
		
		//this label/button will exit the program when clicked
		JLabel ExitBtn = new JLabel("");
		ExitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		ExitBtn.setBounds(817, 23, 45, 55);
		contentPane.add(ExitBtn);
		
		
		//this contains the background of the page/class
		JLabel NewBackGround2 = new JLabel("");
		NewBackGround2.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\NewStartUp.png"));
		NewBackGround2.setBounds(0, -16, 900, 527);
		contentPane.add(NewBackGround2);

	
	}
}
