package VentanasConectadas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Puerta extends JFrame {

	private JPanel contentPane;
	private JButton btnMatusaren;
	private JLabel lblSalida;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntItem;

	
	/**
	 * Create the frame.
	 */
	public Puerta() {
		setTitle("Puerta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnMatusaren = new JButton("Matusaren");
		btnMatusaren.setBounds(127, 200, 183, 23);
		contentPane.add(btnMatusaren);
		
		JLabel lblNewLabel = new JLabel("Puerta");
		lblNewLabel.setBounds(127, 54, 195, 53);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		lblSalida = new JLabel("New label");
		lblSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalida.setBounds(127, 100, 195, 92);
		contentPane.add(lblSalida);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 101, 22);
		contentPane.add(menuBar);
		
		mnFile = new JMenu("Fichero");
		menuBar.add(mnFile);
		
		mntItem = new JMenuItem("Open");
		mnFile.add(mntItem);
	}
	
	void enlazarControl(MandoTrastero c) {
		btnMatusaren.addActionListener(c);
		mntItem.addActionListener(c);
	}


	public JLabel getLblSalida() {
		return lblSalida;
	}



	public void setLblSalida(JLabel lblSalida) {
		this.lblSalida = lblSalida;
	}
}
