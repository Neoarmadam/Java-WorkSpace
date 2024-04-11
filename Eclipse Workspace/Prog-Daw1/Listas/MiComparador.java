import java.util.Comparator;

public class MiComparador implements Comparator<Alumno> {


	@Override
	public int compare(Alumno alu1, Alumno alu2) {
		int devolver=alu1.getEdad()-alu2.getEdad();
		if(devolver==0) {
			devolver=(int) (alu1.getAltura()-alu2.getAltura());
		}
		return devolver;
	}

}
