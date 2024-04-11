package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import Utilidades.UtDialogos;

class Controlador implements ActionListener {
	Ventana vista;
	Modelo mod;
	
	
	public Controlador(Ventana vista, Modelo mod) {
		super();
		this.vista = vista;
		this.mod = mod;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String consulta;
		ResultSet result;
		String solucion="";
		String strCuatri;
		int cuatri;
		String strIdProfesor;
		int idProfesor;
		try {
			strCuatri=vista.getCuatrimestre().getText();
			cuatri=Integer.parseInt(strCuatri);
			strIdProfesor=vista.getIdProfesor().getText();
			idProfesor=Integer.parseInt(strIdProfesor);
			consulta="SELECT * FROM asignatura where cuatrimestre="+cuatri+" and id_profesor="+idProfesor+";";
			mod.conectarBD();
			result=mod.consultar(consulta);
			while(result.next()) {
				solucion+=result.getString(2)+"\n";
			}
			vista.getTextArea().setText(solucion);
		}catch(NumberFormatException ex) {
			UtDialogos.dialoError(vista, "Error, eso no era un numero");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	

	

}
