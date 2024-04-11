package VentanasConectadas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Trastero extends JFrame {

	private JPanel contentPane;
	private JButton btnMarsupial;
	private JTextField Entrada;



	/**
	 * Create the frame.
	 */
	public Trastero() {
		setTitle("Trastero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Trastero");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 11, 323, 34);
		contentPane.add(lblNewLabel);
		
		btnMarsupial = new JButton("Marsupial");
		btnMarsupial.setBounds(101, 186, 138, 34);
		contentPane.add(btnMarsupial);
		
		Entrada = new JTextField();
		Entrada.setBounds(112, 86, 165, 73);
		contentPane.add(Entrada);
		Entrada.setColumns(10);
	}

	void enlazarControl(MandoTrastero c) {
		btnMarsupial.addActionListener(c);
	}

	public JTextField getEntrada() {
		return Entrada;
	}

	public void setEntrada(JTextField entrada) {
		Entrada = entrada;
	}
	
}
