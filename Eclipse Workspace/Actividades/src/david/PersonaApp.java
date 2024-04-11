package david;

public class PersonaApp {
	public static void main(String args[]) {
		Persona persona1=new Persona(21, 1.80, 95, "Alvaro", "Palencia", "1");
		Persona persona2=new Persona(21, 1.70, 95, "Neo", "2");
		Persona persona3=new Persona("Luis", "3");
		Persona persona4=new Persona(21, 1.80, 95, "Alvaro", "Palencia", "1554786L");
		Persona persona5=new Persona(21, 1.80, 95, "Alvaro", "Palencia", "5");
		Persona persona6=new Persona(21, 1.80, 95, "Alvaro", "Palencia", "6");
		
		
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		
		persona3.setEdad(25);
		persona3.setAltura(1.90);
		persona3.setPeso(86);
		System.out.println(persona3.toString());
		
		System.out.println(persona4.toString());
		
		//Vector de objetos
		Persona[] lista= new Persona[6];
		
		lista[0]=persona1;
		lista[1]=persona2;
		lista[2]=new Persona("wamba", "7");
		lista[3]=new Persona(21, 1.80, 95, "fran", "Palencia", "8"); //Como vemos no necesitamos nomprar las personas
		lista[4]=new Persona(21, 1.80, 95, "Carlos", "Palencia", "8"); //Sino que guardamos la posicion en el vector,
		lista[5]=new Persona(21, 1.80, 95, "Alfredo", "Palencia", "8");
		System.out.println(lista[3].getNombre());
		
		for(int i=0;i<lista.length; i++) {
			System.out.print(lista[i].getNombre()+", ");
		}
		
		for(int i=0;i<lista.length; i++) {
			System.out.println(lista[i].toString()+", ");
		}
		
	}
}
