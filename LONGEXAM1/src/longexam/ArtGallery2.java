package longexam;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ArtGallery2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtGallery2 frame = new ArtGallery2();
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
	public ArtGallery2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ArtGalleryBackground1 = new JLabel("");
		ArtGalleryBackground1.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\ArtGallery2.png"));
		ArtGalleryBackground1.setBounds(0, 0, 912, 526);
		contentPane.add(ArtGalleryBackground1);
		
		JLabel ArtGalBackBtn = new JLabel("");
		ArtGalBackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArtGallery1 Art1 = new ArtGallery1();
				Art1.setVisible(true);
				dispose();
			}
		});
		ArtGalBackBtn.setBounds(55, 435, 52, 52);
		contentPane.add(ArtGalBackBtn);
	}

}
