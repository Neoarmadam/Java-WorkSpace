package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import AhorGrafico.Controlador;

public class Ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumDNI;
	private JTextField tfLetraDNI;
	private JButton btnObtener;
	private JButton btnComprobar;
	private JLabel lblLetra;
	private JLabel lblLetraDNI;
	private JLabel lblDniNumero;

	

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		tfNumDNI = new JTextField();
		tfNumDNI.setBounds(35, 31, 120, 20);
		contentPane.add(tfNumDNI);
		tfNumDNI.setColumns(10);
		
		lblDniNumero = new JLabel("DNI Numero");
		lblDniNumero.setBounds(52, 11, 86, 14);
		contentPane.add(lblDniNumero);
		
		tfLetraDNI = new JTextField();
		tfLetraDNI.setBounds(196, 31, 86, 20);
		contentPane.add(tfLetraDNI);
		tfLetraDNI.setColumns(10);
		
		lblLetraDNI = new JLabel("DNI Letra");
		lblLetraDNI.setBounds(210, 11, 72, 14);
		contentPane.add(lblLetraDNI);
		
		lblLetra = new JLabel("Letra");
		lblLetra.setBounds(174, 141, 97, 14);
		contentPane.add(lblLetra);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(52, 195, 89, 23);
		contentPane.add(btnComprobar);
		
		btnObtener = new JButton("Obtener");
		btnObtener.setBounds(203, 195, 89, 23);
		contentPane.add(btnObtener);
	}
	void enlazarControlador(Controlador3 control) {
		btnComprobar.addActionListener(control);
		btnObtener.addActionListener(control);
	}


	public JTextField getTfNumDNI() {
		return tfNumDNI;
	}



	public void setTfNumDNI(JTextField tfNumDNI) {
		this.tfNumDNI = tfNumDNI;
	}



	public JTextField getTfLetraDNI() {
		return tfLetraDNI;
	}



	public void setTfLetraDNI(JTextField tfLetraDNI) {
		this.tfLetraDNI = tfLetraDNI;
	}



	public JButton getBtnObtener() {
		return btnObtener;
	}



	public void setBtnObtener(JButton btnObtener) {
		this.btnObtener = btnObtener;
	}



	public JButton getBtnComprobar() {
		return btnComprobar;
	}



	public void setBtnComprobar(JButton btnComprobar) {
		this.btnComprobar = btnComprobar;
	}



	public JLabel getLblLetra() {
		return lblLetra;
	}



	public void setLblLetra(JLabel lblLetra) {
		this.lblLetra = lblLetra;
	}



	public JLabel getLblLetraDNI() {
		return lblLetraDNI;
	}



	public void setLblLetraDNI(JLabel lblLetraDNI) {
		this.lblLetraDNI = lblLetraDNI;
	}



	public JLabel getLblDniNumero() {
		return lblDniNumero;
	}



	public void setLblDniNumero(JLabel lblDniNumero) {
		this.lblDniNumero = lblDniNumero;
	}
	
}
