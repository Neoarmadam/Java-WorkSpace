package EjerCristina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

class Ventana extends JFrame {

	private JPanel contentPane;
	private JButton btnConsultar;
	private JTextArea textArea;
	private JTextField Cuatrimestre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Pago medio A\u00F1o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 63, 318, 120);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(138, 205, 134, 23);
		contentPane.add(btnConsultar);
		
		Cuatrimestre = new JTextField();
		Cuatrimestre.setBounds(126, 11, 86, 20);
		contentPane.add(Cuatrimestre);
		Cuatrimestre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Indica A\u00F1o:");
		lblNewLabel.setBounds(20, 14, 151, 14);
		contentPane.add(lblNewLabel);
	}
	
	void enlazarControlador(Controlador c){
		btnConsultar.addActionListener(c);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JTextField getCuatrimestre() {
		return Cuatrimestre;
	}

	public void setCuatrimestre(JTextField cuatrimestre) {
		Cuatrimestre = cuatrimestre;
	}

}
