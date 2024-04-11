package EjerCristina;

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

	//INSERT INTO pago VALUES (15,'PayPal','ak-std-000035','2009-02-15',10000);

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String consulta;
		ResultSet result;
		String solucion="";
		String strAno;
		int ano;
		try {
			strAno=vista.getCuatrimestre().getText();
			ano=Integer.parseInt(strAno);
			consulta="SELECT avg(total) Media_Pago FROM pago where fecha_pago<='"+ano+"-12-31' and fecha_pago>='"+ano+"-01-01';";
			mod.conectarBD();
			result=mod.consultar(consulta);
			result.next();
			solucion+="La media de pagos del año "+ano+" es "+result.getString(1)+"€";
			
			
			vista.getTextArea().setText(solucion);
		}catch(NumberFormatException ex) {
			UtDialogos.dialoError(vista, "Error, eso no era un numero");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	

	

}
