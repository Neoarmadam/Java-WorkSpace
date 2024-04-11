package ActividadesClaseAlumno;

public class Actividad_2 {
	public static void main (String args[]) {
		Alumno alumno1= new Alumno();
		alumno1.pedirDatos();
		alumno1.modNotas();
		System.out.println(alumno1.toString());
		alumno1.repite(alumno1);
		alumno1.beca(alumno1.mediaVector(alumno1));
	}
}
