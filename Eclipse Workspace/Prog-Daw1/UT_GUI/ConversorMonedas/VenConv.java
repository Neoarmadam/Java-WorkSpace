package ConversorMonedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RepasoModeloControl.Controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VenConv extends JFrame {

	private JPanel contentPane;
	private JButton btnConvertir;
	private JLabel lblResultado;
	private JTextField textField;
	private JCheckBox chInvertir;
	private JButton btnLibras;



	/**
	 * Create the frame.
	 */
	public VenConv() {
		setTitle("Conversor Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(136, 227, 165, 23);
		contentPane.add(btnConvertir);
		
		lblResultado = new JLabel("Esperando...");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(279, 74, 93, 52);
		contentPane.add(lblResultado);
		
		textField = new JTextField();
		textField.setBounds(67, 74, 93, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		chInvertir = new JCheckBox("Invertir Conversor");
		chInvertir.setBounds(180, 159, 165, 23);
		contentPane.add(chInvertir);
		
		btnLibras = new JButton("Libras");
		btnLibras.setBounds(335, 227, 89, 23);
		contentPane.add(btnLibras);
	}
	
	void enlazarControlador(ConversorMonedas.Controlador control) {
		btnConvertir.addActionListener(control);
		btnLibras.addActionListener(control);
		//Esperar dos eventos
		chInvertir.addActionListener(control);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JCheckBox getChInvertir() {
		return chInvertir;
	}

	public void setChInvertir(JCheckBox chckbxInvertir) {
		this.chInvertir = chckbxInvertir;
	}

	public JLabel getLblResultado() {
		return lblResultado;
	}

	public void setLblResultado(JLabel lblResultado) {
		this.lblResultado = lblResultado;
	}

	public JButton getBtnConvertir() {
		return btnConvertir;
	}

	public void setBtnConvertir(JButton btnConvertir) {
		this.btnConvertir = btnConvertir;
	}

	public JButton getBtnLibras() {
		return btnLibras;
	}

	public void setBtnLibras(JButton btnLibras) {
		this.btnLibras = btnLibras;
	}
	
	
}
