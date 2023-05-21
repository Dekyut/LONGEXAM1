package longexam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SkillsExpPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkillsExpPage frame = new SkillsExpPage();
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
	public SkillsExpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Skill1 = new JLabel("Problem Solving");
		Skill1.setForeground(new Color(0, 0, 205));
		Skill1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill1.setBounds(115, 167, 250, 45);
		contentPane.add(Skill1);
		
		JLabel Skill2 = new JLabel("Leadership");
		Skill2.setForeground(new Color(0, 0, 205));
		Skill2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill2.setBounds(115, 232, 250, 45);
		contentPane.add(Skill2);
		
		JLabel Skill3 = new JLabel("Adaptability");
		Skill3.setForeground(new Color(0, 0, 205));
		Skill3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill3.setBounds(115, 295, 250, 45);
		contentPane.add(Skill3);
		
		JLabel Skill4 = new JLabel("Public Speaking");
		Skill4.setForeground(new Color(0, 0, 205));
		Skill4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill4.setBounds(115, 356, 250, 45);
		contentPane.add(Skill4);
		
		JLabel Skill5 = new JLabel("Basic Java");
		Skill5.setForeground(new Color(0, 0, 205));
		Skill5.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill5.setBounds(565, 167, 250, 45);
		contentPane.add(Skill5);
		
		JLabel Skill6 = new JLabel("Presentation");
		Skill6.setForeground(new Color(0, 0, 205));
		Skill6.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill6.setBounds(565, 232, 250, 45);
		contentPane.add(Skill6);
		
		JLabel Skill7 = new JLabel("Digital Illustrations");
		Skill7.setForeground(new Color(0, 0, 205));
		Skill7.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill7.setBounds(565, 295, 250, 45);
		contentPane.add(Skill7);
		
		JLabel Skill8 = new JLabel("Graphic Design");
		Skill8.setForeground(new Color(0, 0, 205));
		Skill8.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		Skill8.setBounds(565, 356, 250, 45);
		contentPane.add(Skill8);
		
		JLabel BackBtn = new JLabel("");
		BackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StartUpPage sup = new StartUpPage();
				sup.setVisible(true);
				dispose();
			}
		});
		BackBtn.setBounds(383, 437, 135, 52);
		contentPane.add(BackBtn);
		
		JLabel SkillsExpBack = new JLabel("");
		SkillsExpBack.setIcon(new ImageIcon("C:\\Users\\Lovely\\eclipse-workspace\\LONGEXAM1\\src\\longexam\\SkillsExp.png"));
		SkillsExpBack.setBounds(0, 0, 886, 511);
		contentPane.add(SkillsExpBack);
		

	}

}
