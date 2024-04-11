import java.util.HashSet;
import java.util.Iterator;

public class PruebaSet {
	public static void main(String[] args) {
		//Variables
		HashSet<Alumno> set=new HashSet<Alumno>();
		Iterator iter;
		
		//Introducir datos
		set.add(new Alumno(21,176, 'D',"Daw"));
		set.add(new Alumno(35,176, 'D',"Daw"));
		set.add(new Alumno(21,174, 'D',"Daw"));
		
		
		
		
		//Ejecucion de la prueba
		
		
		/*
		for (Alumno alu:set) {
			System.out.println(alu.toString());
		}*/
		
		Alumno aluAux=null;
		iter=set.iterator();
		while(iter.hasNext()) {
			aluAux=(Alumno)iter.next();
			if(((Alumno)iter.next()).getEdad()==35 || ((Alumno)iter).getGrupo()=='D') { //con aux furrala mejor
				//System.out.println(aluAux.toString());
				//break;
				iter.remove();
			}
		}
		
		/*
		if (aluAux!=null) {
			iter.remove();
			//set.remove(aluAux);
		}
		*/
		iter=set.iterator();
		for (Alumno alu:set) {
			System.out.println(alu.toString());
		}
	}
}
