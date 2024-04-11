package RepasoModeloControl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JLabel lblResultado;
	private JButton btnSumar;
	private JTextPane textPane;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		btnSumar = new JButton("Sumar");
		setTitle("Sumar para Tontos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		btnSumar.setBounds(5, 233, 424, 23);
		
		contentPane.setLayout(null);
		contentPane.add(btnSumar);
		
		lblResultado = new JLabel("...");
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblResultado.setForeground(new Color(0, 0, 255));
		lblResultado.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblResultado.setBackground(new Color(104, 240, 226));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(121, 186, 208, 36);
		contentPane.add(lblResultado);
		
		textPane = new JTextPane();
		textPane.setBounds(50, 27, 139, 72);
		contentPane.add(textPane);
		setVisible(true);
	}
	
	

	void enlazarControlador(Controlador c) {
		btnSumar.addActionListener(c);
		textPane.addMouseListener(c);
	}
	
	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}
	
	public JLabel getLblResultado() {
		return lblResultado;
	}

	public void setLblResultado(JLabel lblResultado) {
		this.lblResultado = lblResultado;
	}

	public JButton getBtnSumar() {
		return btnSumar;
	}

	public void setBtnSumar(JButton btnSumar) {
		this.btnSumar = btnSumar;
	}
}
