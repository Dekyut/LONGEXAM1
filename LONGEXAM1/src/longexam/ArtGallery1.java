package longexam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ArtGallery1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtGallery1 frame = new ArtGallery1();
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
	public ArtGallery1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ArtGalleryBackground1 = new JLabel("");
		ArtGalleryBackground1.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\ArtGallery1.png"));
		ArtGalleryBackground1.setBounds(0, 0, 912, 526);
		contentPane.add(ArtGalleryBackground1);
		
		JLabel ArtGalBackBtn = new JLabel("");
		ArtGalBackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StartUpPage sta = new StartUpPage();
				sta.setVisible(true);
				dispose();
			}
		});
		ArtGalBackBtn.setBounds(55, 435, 52, 52);
		contentPane.add(ArtGalBackBtn);
		
		JLabel ArtGalNextBtn = new JLabel("");
		ArtGalNextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArtGallery2 art2 = new ArtGallery2();
				art2.setVisible(true);
				dispose();
			}
		});
		ArtGalNextBtn.setBounds(790, 435, 60, 52);
		contentPane.add(ArtGalNextBtn);
	}

}
