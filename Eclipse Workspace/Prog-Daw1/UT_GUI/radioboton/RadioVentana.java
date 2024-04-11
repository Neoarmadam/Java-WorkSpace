package radioboton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class RadioVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioVentana frame = new RadioVentana();
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
	public RadioVentana() {
		JRadioButton rdRojo = new JRadioButton("Rojo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(5, 233, 424, 23);
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCambiar);
		ButtonGroup grupoColor =new ButtonGroup();
		grupoColor.add(rdRojo);
		JPanel panelRadio = new JPanel();
		panelRadio.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelRadio.setBounds(310, 5, 119, 130);
		contentPane.add(panelRadio);
		panelRadio.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colores");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 5, 99, 28);
		panelRadio.add(lblNewLabel);
		
		
		rdRojo.setBounds(6, 40, 109, 23);
		panelRadio.add(rdRojo);
		
		JRadioButton rdAzul = new JRadioButton("Azul");
		rdAzul.setBounds(6, 66, 109, 23);
		panelRadio.add(rdAzul);
		
		JRadioButton rdAmarillo = new JRadioButton("Amarillo");
		rdAmarillo.setBounds(6, 92, 109, 23);
		panelRadio.add(rdAmarillo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 255));
		panel.setBounds(10, 11, 287, 208);
		contentPane.add(panel);
	}
}
