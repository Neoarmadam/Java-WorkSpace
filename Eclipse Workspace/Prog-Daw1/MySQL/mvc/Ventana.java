package mvc;

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
	private JTextField idProfesor;
	private JLabel lblNewLabel_1;

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
		
		btnConsultar = new JButton("New button");
		btnConsultar.setBounds(166, 205, 89, 23);
		contentPane.add(btnConsultar);
		
		Cuatrimestre = new JTextField();
		Cuatrimestre.setBounds(126, 11, 86, 20);
		contentPane.add(Cuatrimestre);
		Cuatrimestre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Indica Cuatrimestre:");
		lblNewLabel.setBounds(20, 14, 151, 14);
		contentPane.add(lblNewLabel);
		
		idProfesor = new JTextField();
		idProfesor.setBounds(290, 11, 86, 20);
		contentPane.add(idProfesor);
		idProfesor.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Id Profesor:");
		lblNewLabel_1.setBounds(222, 14, 66, 17);
		contentPane.add(lblNewLabel_1);
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

	public JTextField getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(JTextField idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	
	
}
