package Examen_EV2;

public class Maquina {
	public static void main (String args[]) {
		Manzana[] manzanas= new Manzana[5];
		
		//inicializo a lo guarro que no da tiempo
		manzanas[0]=new Manzana(40, "peru");
		manzanas[1]=new Manzana(20, "roja");
		manzanas[2]=new Manzana(340, "verde");
		manzanas[3]=new Manzana(30, "roja");
		manzanas[4]=new Manzana(10, "verde");
		
		//Comprobacion de metodos
		System.out.println(compPeso(manzanas));
		System.out.println(compColor(manzanas));
		System.out.println(mediaDese(manzanas));
		System.out.println(manzGran(manzanas));
		System.out.println(manzMed(manzanas));
		System.out.println(manzPequ(manzanas));
		System.out.println(manzVerdes(manzanas));
		System.out.println(manzAmarilla(manzanas));
		System.out.println(manzRojas(manzanas));
	}
	
	//Comprobar desechadas por peso
	public static int compPeso(Manzana[] manzanas) {
		int desechadas=0;
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getPeso()<20 || manzanas[f].getPeso()>50) {
				desechadas++;
			}
		}
		return desechadas;
	}
	
	//Comprobar desechadas de color
	public static int compColor(Manzana[] manzanas) {
		int desechadas=0;
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getColor().equalsIgnoreCase("roja")|| manzanas[f].getColor().equalsIgnoreCase("verde")||manzanas[f].getColor().equalsIgnoreCase("amarilla")) {
				desechadas++;
			}
		}
		desechadas=manzanas.length-desechadas;
		return desechadas;
	}
	
	//Comprobar media desechadas
	public static int mediaDese(Manzana[] manzanas) {
		int media=(compColor(manzanas)+compPeso(manzanas))/2;
		return media;
	}
	
	//Comprobar tamaños de manzanas en estos tres siguientes metodos
	public static int manzPequ(Manzana[] manzanas) {
		int totales=0; //hace referencia al totales de manzanas de un tipo buscadas
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getPeso()>19 && manzanas[f].getPeso()<31) {
				totales++;
			}
		}
		return totales;
	}
	public static int manzMed(Manzana[] manzanas) {
		int totales=0; //hace referencia al totales de manzanas de un tipo buscadas
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getPeso()>30 && manzanas[f].getPeso()<41) {
				totales++;
			}
		}
		return totales;
	}
	public static int manzGran(Manzana[] manzanas) {
		int totales=0; //hace referencia al totales de manzanas de un tipo buscadas
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getPeso()>40 && manzanas[f].getPeso()<51) {
				totales++;
			}
		}
		return totales;
	}
	
	//Comprobar colores manzanas en los tres metodos
	public static int manzRojas(Manzana[] manzanas) {
		int totales=0; //hace referencia al totales de manzanas de un tipo buscadas
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getColor().equalsIgnoreCase("roja")) {
				totales++;
			}
		}
		return totales;
	}
	public static int manzVerdes(Manzana[] manzanas) {
		int totales=0; //hace referencia al totales de manzanas de un tipo buscadas
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getColor().equalsIgnoreCase("verde")) {
				totales++;
			}
		}
		return totales;
	}
	public static int manzAmarilla(Manzana[] manzanas) {
		int totales=0; //hace referencia al totales de manzanas de un tipo buscadas
		for(int f=0; f<manzanas.length; f++) {
			if(manzanas[f].getColor().equalsIgnoreCase("amarilla")) {
				totales++;
			}
		}
		return totales;
	}
}
