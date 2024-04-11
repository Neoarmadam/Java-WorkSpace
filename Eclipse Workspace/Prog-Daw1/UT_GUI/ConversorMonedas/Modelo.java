package ConversorMonedas;

public class Modelo {

	float converEuroDolar(float euro) {
		return euro*1.07f;
	}
	
	float converDolarEuro(float dolar) {
		return dolar/1.07f;
	}
	
	float converEuroLibras(float euro) {
		return euro*0.87f;
	}
	
	float converDolarLibras(float dolar) {
		return dolar*0.81f;
	}
}
