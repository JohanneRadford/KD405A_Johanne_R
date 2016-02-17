import java.awt.BorderLayout;
import java.util.Calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ClockLogic clockLogic;
	private JLabel labelTime;
	private JLabel labelAlarm;
	private JLabel labelAlarmTime;
	private JLabel lblTimeIs;

	
public void setTimeOnLabel(String time){
	labelTime.setText(time);
}

public void showAlarmTimeOnLabel(String alarmTime){
	//labelAlarmTime.setText();
}

	public void activateAlarm(boolean activate){
		if(activate){
			
		}else{
			
		}
		
	}
	
	  // Calendar cal = Calendar.getInstance();
	   //Calendar now = Calendar.getInstance();
	   //Calendar later = Calendar.getInstance();



	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel lblHour = new JLabel("HOUR");
		lblHour.setBounds(37, 184, 61, 16);
		contentPane.add(lblHour);
		
		textField = new JTextField();
		textField.setBounds(84, 179, 68, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMinutes = new JLabel("MINUTES");
		lblMinutes.setBounds(171, 184, 61, 16);
		contentPane.add(lblMinutes);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 179, 75, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSetAlarm = new JButton("SET ALARM");
		btnSetAlarm.setBounds(47, 219, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("CLEAR ALARM");
		btnClearAlarm.setBounds(192, 219, 117, 29);
		contentPane.add(btnClearAlarm);
		
		
		JLabel lblAlarmAt = new JLabel("ALARM AT");
		lblAlarmAt.setBounds(37, 100, 75, 16);
		contentPane.add(lblAlarmAt);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Avenir", Font.PLAIN, 25));
		labelTime.setBounds(37, 23, 294, 69);
		contentPane.add(labelTime);
		
		labelAlarmTime = new JLabel("New label");
		labelAlarmTime.setBounds(37, 122, 154, 45);
		contentPane.add(labelAlarmTime);
		
		lblTimeIs = new JLabel("Time is");
		lblTimeIs.setBounds(37, 6, 61, 16);
		contentPane.add(lblTimeIs);
		
		clockLogic = new ClockLogic(this);
	}
}
