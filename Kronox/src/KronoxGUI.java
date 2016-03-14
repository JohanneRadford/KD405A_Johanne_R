import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;

public class KronoxGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KronoxGUI frame = new KronoxGUI();
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
	public KronoxGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 540, 960);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgramcourse = new JLabel("PROGRAM/COURSE");
		lblProgramcourse.setFont(new Font("Futura", Font.PLAIN, 14));
		lblProgramcourse.setForeground(Color.WHITE);
		lblProgramcourse.setBackground(Color.BLACK);
		lblProgramcourse.setBounds(130, 161, 377, 49);
		contentPane.add(lblProgramcourse);
		
		JLabel lblRoom = new JLabel("ROOM");
		lblRoom.setFont(new Font("Futura", Font.PLAIN, 14));
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setBackground(Color.BLACK);
		lblRoom.setBounds(315, 161, 61, 49);
		contentPane.add(lblRoom);
		
		JLabel lblNewLabel = new JLabel("START/END");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(6, 161, 85, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setFont(new Font("Futura", Font.PLAIN, 14));
		lblInfo.setForeground(Color.WHITE);
		lblInfo.setBackground(Color.BLACK);
		lblInfo.setBounds(435, 161, 55, 49);
		contentPane.add(lblInfo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 158, 540, 49);
		contentPane.add(textArea);
		
		JLabel lblNiagara = new JLabel("NIAGARA");
		lblNiagara.setFont(new Font("Futura", Font.PLAIN, 55));
		lblNiagara.setBounds(117, 16, 275, 60);
		contentPane.add(lblNiagara);
		
		JLabel lblSchedule = new JLabel("SCHEDULE");
		lblSchedule.setFont(new Font("Futura", Font.PLAIN, 40));
		lblSchedule.setBounds(117, 71, 207, 49);
		contentPane.add(lblSchedule);
		
		JLabel label = new JLabel("14-03-2016");
		label.setFont(new Font("Futura", Font.PLAIN, 16));
		label.setBounds(435, 63, 99, 18);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("13:33");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 55));
		lblNewLabel_1.setBounds(373, 75, 167, 74);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/Users/johanneradford/Desktop/Malmö-en1-127x150.png"));
		label_1.setBounds(20, 6, 85, 124);
		contentPane.add(label_1);
	}
}
