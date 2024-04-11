package PreparacionExamenEv2;
	import java.util.StringTokenizer;
	import java.util.Scanner;
public class Persona {
	/**Variables del objeto Persona**/
	private String nombre, apellido1, apellido2;
	private int edad;
	private char sexo; //H hombre, M mujer.
	private float peso, altura;
	private int intDNI;
	private char charDNI;
	
	/**Pedir datos con un Tokenizer**/
	public void pedirDatosTokenizer(String stringTok) {
		//Variables
		StringTokenizer st=new StringTokenizer(stringTok, "+");
		//Resolucion
		nombre=st.nextToken();
		apellido1=st.nextToken();
		apellido2=st.nextToken();
		edad=Integer.parseInt(st.nextToken());
		peso=Float.parseFloat(st.nextToken());
		altura=Float.parseFloat(st.nextToken());
		intDNI=Integer.parseInt(st.nextToken());
		charDNI=st.nextToken().charAt(0);
		sexo=charDNI=st.nextToken().charAt(0);
	}
	
	
	
	/**Pedir Sexo**/
	public void pedirSexo() {
		//Variables
		Scanner sc=new Scanner(System.in);
		boolean verificado=false;
		//Resolucion
		System.out.println("Elija el sexo de la persona");
		sexo=sc.next().charAt(0);
		while(verificado==false) {
			switch (sexo) {
			case 'H','M':
				verificado=true;
				break;
			case 'm':
				sexo='M';
				break;
			case 'h':
				sexo='H';
				break;
			default:
				System.out.println("Sexo no valido");
				sexo=sc.next().charAt(0);
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





























	/**Constructores**/
	//Todos los datos
	public Persona(String nombre, String apellido1, String apellido2, int edad, char sexo, float peso, float altura, int intDNI, char charDNI) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.intDNI = intDNI;
		this.charDNI = charDNI;
	}

	//Sin datos
	public Persona() {
	}
	
	//Sin Sexo
	public Persona(String nombre, String apellido1, String apellido2, int edad, float peso, float altura, int intDNI,
	    char charDNI) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.intDNI = intDNI;
		this.charDNI = charDNI;
	}

	/**Getters and Setters**/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getIntDNI() {
		return intDNI;
	}

	public void setIntDNI(int intDNI) {
		this.intDNI = intDNI;
	}

	public char getCharDNI() {
		return charDNI;
	}

	public void setCharDNI(char charDNI) {
		this.charDNI = charDNI;
	}
	
	/**To String**/
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
		    + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", intDNI=" + intDNI + ", charDNI=" + charDNI
		    + "]";
	}
	
	
	
}
