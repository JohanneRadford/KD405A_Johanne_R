import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtNamn;
	private JTextField txtPersonnr;
	private JTextField txtAdress;
	private JTextField txtTelefonummer;
	private JTextField txtEpost;
	private JTextField txtMedlemmer;
	private JTextField txtName;
	private JTextField txtPersonnr_1;
	private JTextField txtAdresse;
	private JTextField txtEpost_1;
	private JTextField txtNummer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//first comment
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 343);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(47, 79, 79));
		menuBar.setForeground(new Color(0, 0, 0));
		setJMenuBar(menuBar);
		
		JMenu mnMedlemmer = new JMenu("Medlem");
		mnMedlemmer.setFont(new Font("Avenir", Font.PLAIN, 16));
		mnMedlemmer.setBackground(new Color(47, 79, 79));
		mnMedlemmer.setForeground(new Color(0, 0, 0));
		menuBar.add(mnMedlemmer);
		
		JCheckBoxMenuItem chckbxmntmAllaMedlemmar = new JCheckBoxMenuItem("Alla medlemmar");
		mnMedlemmer.add(chckbxmntmAllaMedlemmar);
		
		JCheckBoxMenuItem chckbxmntmMedlem_2 = new JCheckBoxMenuItem("Ny medlem");
		mnMedlemmer.add(chckbxmntmMedlem_2);
		
		JCheckBoxMenuItem chckbxmntmMedlem_1 = new JCheckBoxMenuItem("Hitta medlem");
		mnMedlemmer.add(chckbxmntmMedlem_1);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setFont(new Font("Avenir", Font.PLAIN, 16));
		mnArkiv.setBackground(new Color(47, 79, 79));
		mnArkiv.setForeground(new Color(0, 0, 0));
		menuBar.add(mnArkiv);
		
		JCheckBoxMenuItem chckbxmntmSkrivUt = new JCheckBoxMenuItem("Skriv ut");
		mnArkiv.add(chckbxmntmSkrivUt);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Avsluta");
		mnArkiv.add(chckbxmntmNewCheckItem);
		
		JMenu mnHjelp = new JMenu("Hjelp");
		mnHjelp.setFont(new Font("Avenir", Font.PLAIN, 16));
		mnHjelp.setBackground(new Color(47, 79, 79));
		mnHjelp.setForeground(new Color(0, 0, 0));
		menuBar.add(mnHjelp);
		
		JCheckBoxMenuItem chckbxmntmHjelp = new JCheckBoxMenuItem("Hjelp");
		mnHjelp.add(chckbxmntmHjelp);
		
		JCheckBoxMenuItem chckbxmntmOmProgrammet = new JCheckBoxMenuItem("Om programmet");
		mnHjelp.add(chckbxmntmOmProgrammet);
		
		JLabel label_1 = new JLabel("                                                             ");
		menuBar.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/johanneradford/Desktop/KD405A_Johanne_R/Assignment_1/src/bilde/Nordic_Welness.png"));
		menuBar.add(label);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 27, 135, 201);
		contentPane.add(scrollPane);
		
		JTextArea txtrText = new JTextArea();
		txtrText.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtrText.setEditable(false);
		scrollPane.setViewportView(txtrText);
		txtrText.setText("Marte Saghagen\nEline Simonsen\nVincent Simonsen\nTuva Høgevold\nMaiken Skaga\nVeslemøy Kvande\nJens Haaland\nMina Bakken\nFilip Sarfi\nElise Lundamo\nKristin Lønn\nYandeh Khan\nMikkel Ulleberg\nBjørn Børressen");
		
		txtMedlemmer = new JTextField();
		txtMedlemmer.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtMedlemmer.setHorizontalAlignment(SwingConstants.LEFT);
		txtMedlemmer.setEditable(false);
		txtMedlemmer.setBackground(new Color(240, 248, 255));
		txtMedlemmer.setText("Medlemmer");
		scrollPane.setColumnHeaderView(txtMedlemmer);
		txtMedlemmer.setColumns(10);
		
		txtNamn = new JTextField();
		txtNamn.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtNamn.setText("Marte Saghagen");
		txtNamn.setBounds(291, 27, 130, 26);
		contentPane.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtPersonnr = new JTextField();
		txtPersonnr.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtPersonnr.setText("19941206-35091");
		txtPersonnr.setBounds(291, 55, 130, 26);
		contentPane.add(txtPersonnr);
		txtPersonnr.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtAdress.setText("Lundbergsgatan 8");
		txtAdress.setBounds(291, 82, 130, 26);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtTelefonummer = new JTextField();
		txtTelefonummer.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtTelefonummer.setText("MarteS@gmail.com");
		txtTelefonummer.setBounds(291, 112, 130, 26);
		contentPane.add(txtTelefonummer);
		txtTelefonummer.setColumns(10);
		
		txtEpost = new JTextField();
		txtEpost.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtEpost.setText("0766754837");
		txtEpost.setBounds(291, 139, 130, 26);
		contentPane.add(txtEpost);
		txtEpost.setColumns(10);
		
		JLabel lblBildejpg = new JLabel("bilde.jpg");
		lblBildejpg.setIcon(new ImageIcon("/Users/johanneradford/Desktop/KD405A_Johanne_R/Assignment_1/src/bilde/Profil_bilde.jpg"));
		lblBildejpg.setBounds(445, 27, 130, 184);
		contentPane.add(lblBildejpg);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setFont(new Font("Avenir", Font.PLAIN, 13));
		btnSpara.setBackground(Color.DARK_GRAY);
		btnSpara.setForeground(Color.DARK_GRAY);
		btnSpara.setBounds(293, 199, 117, 29);
		contentPane.add(btnSpara);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtName.setText("Name:");
		txtName.setBounds(191, 28, 92, 26);
		contentPane.add(txtName);
		
		txtPersonnr_1 = new JTextField();
		txtPersonnr_1.setEditable(false);
		txtPersonnr_1.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtPersonnr_1.setText("Personnr:");
		txtPersonnr_1.setBounds(191, 54, 92, 26);
		contentPane.add(txtPersonnr_1);
		
		txtAdresse = new JTextField();
		txtAdresse.setEditable(false);
		txtAdresse.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtAdresse.setText("Adresse:");
		txtAdresse.setBounds(191, 81, 92, 26);
		contentPane.add(txtAdresse);
		
		txtEpost_1 = new JTextField();
		txtEpost_1.setEditable(false);
		txtEpost_1.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtEpost_1.setText("E-post:");
		txtEpost_1.setBounds(191, 111, 92, 26);
		contentPane.add(txtEpost_1);
		
		txtNummer = new JTextField();
		txtNummer.setEditable(false);
		txtNummer.setFont(new Font("Avenir", Font.PLAIN, 12));
		txtNummer.setText("Nummer:");
		txtNummer.setBounds(191, 138, 92, 26);
		contentPane.add(txtNummer);
	}
}
