package Pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {
	private JPanel panelColor;
	private JPanel contentPane;
	private JButton btnNewButton;


	/**
	 * Create the frame.
	 */
	public Ventana() {
		panelColor = new JPanel();
		btnNewButton= new JButton("New b");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		contentPane.add(panelColor, BorderLayout.CENTER);
		setVisible(true);
	}
	public void enlazaControlador(Controlador c) {
		btnNewButton.addActionListener(c);
	}
	
	public JPanel getPanelColor() {
		return panelColor;
	}

	public void setPanelColor(JPanel panelColor) {
		this.panelColor = panelColor;
	}

}
