package M10.lambdas.Nivell1Fase2;



public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Crea una Functional Interface que contingui un mètode abstracte "int getMultiple(int valor)",
		// que retorna un valor int i reberà un altre valor int.
		// En una altra classe, instancia la interfície i invoca el mètode
		// amb un 3 com a paràmetre i que retorni el triple d'aquest valor rebut.
		// imprimeix el resultat.

		// Definim el cos de la interfice
		PiFunctionalInterface metodoPi = () -> 3.1416;

		// Invoquem el mètode
		System.out.println(metodoPi.getPiValue());
		
		
		
		
		
		
	}

}
