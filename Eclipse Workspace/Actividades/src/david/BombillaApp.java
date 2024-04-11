package david;

public class BombillaApp {
	public static void main(String[] args) {
		
		Bombilla bom1=new Bombilla();
		Bombilla bom2=new Bombilla(15);
		Bombilla bom3=new Bombilla(false);
		Bombilla bom4=new Bombilla(30, true);
		
		System.out.println(bom1.toString());
		System.out.println(bom2.toString());
		System.out.println(bom3.toString());
		System.out.println(bom4.toString());
	}
}
