package astros;

public class AppPlaneta {
	public static void main (String args[]) {
		Planeta tierra=new Planeta();
		//radio=6341
		//5.972*10^24  *Math.pow(10, 24);
		Planeta marte=new Planeta();
		Planeta jupiter=new Planeta();
		
		
		tierra.setMasaPlaneta(5.972*Math.pow(10, 24));
		tierra.setRadioPlaneta(6371000);
		tierra.setNombrePlaneta("Tierra");
		tierra.setDistSol(1);
		tierra.setHabitado(true);
		tierra.setNumLunas(1);
		
		marte.setMasaPlaneta(6.39*Math.pow(10, 23));
		marte.setRadioPlaneta(3389000);
		marte.setNombrePlaneta("Marte");
		marte.setNumLunas(2);
		marte.setHabitado(false);
		marte.setDistSol(1.52);
		
		jupiter.setMasaPlaneta(1.898e27);
		jupiter.setRadioPlaneta(71492000);
		jupiter.setNombrePlaneta("Jupiter");
		jupiter.setNumLunas(79);
		jupiter.setHabitado(false);
		jupiter.setDistSol(5.2);
		
		System.out.println(tierra.getGravedad());
		System.out.println(marte.getGravedad());
		System.out.println(jupiter.getGravedad());
		System.out.println(peso(96, tierra, jupiter));
		
		System.out.println(peso(10, marte));
		System.out.println(tierra.masa(10));
		
		
		
	}
	
	
	public static double peso(double masa, Planeta pla) {
		double fuerza=pla.getGravedad();
		masa=masa*fuerza;
		return masa;
	}
	
	public static double peso(double masa, Planeta inicial, Planeta fin) {
		masa=masa/inicial.getGravedad()*fin.getGravedad();
		return masa;
	}
}
