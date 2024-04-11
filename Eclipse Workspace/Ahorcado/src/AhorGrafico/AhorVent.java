package AhorGrafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;


import javax.swing.JButton;

public class AhorVent extends JFrame {

	private JPanel contentPane;
	private JTextField txtEntrada;
	private JLabel lbDecirEntrada;
	private JLabel lbIntentos;
	private JLabel lbPista;
	private JButton btnJugar;


	/**
	 * Create the frame.
	 */
	public AhorVent() {
		setTitle("Ahorcado Neo");
		lbDecirEntrada = new JLabel("Entrada:");
		lbIntentos = new JLabel("Intentos: 7");
		lbPista = new JLabel("Pista: *****");
		btnJugar = new JButton("Jugar");
		
		txtEntrada = new JTextField();
		txtEntrada.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtEntrada.setName("");
		txtEntrada.setToolTipText("");
		txtEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtEntrada.setBounds(33, 45, 110, 38);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		
		lbDecirEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lbDecirEntrada.setBounds(33, 24, 110, 22);
		contentPane.add(lbDecirEntrada);
		
		
		lbIntentos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbIntentos.setHorizontalAlignment(SwingConstants.CENTER);
		lbIntentos.setBounds(273, 45, 117, 38);
		contentPane.add(lbIntentos);
		
		
		lbPista.setHorizontalAlignment(SwingConstants.CENTER);
		lbPista.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbPista.setBounds(273, 128, 117, 49);
		contentPane.add(lbPista);
		
		
		btnJugar.setBounds(33, 128, 110, 49);
		contentPane.add(btnJugar);
	}
	void enlazarControlador(Controlador c) {
		btnJugar.addActionListener(c);
	}
	
	/***Get/Set***/
	
	public JTextField getTxtEntrada() {
		return txtEntrada;
	}

	public void setTxtEntrada(JTextField txtEntrada) {
		this.txtEntrada = txtEntrada;
	}

	public JLabel getLbIntentos() {
		return lbIntentos;
	}

	public void setLbIntentos(JLabel lbIntentos) {
		this.lbIntentos = lbIntentos;
	}

	public JLabel getLbPista() {
		return lbPista;
	}

	public void setLbPista(JLabel lbPista) {
		this.lbPista = lbPista;
	}

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}
	
}
