package M10.lambdas.Nivell1Fase2;



public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Crea una Functional Interface que contingui un m�tode abstracte "int getMultiple(int valor)",
		// que retorna un valor int i reber� un altre valor int.
		// En una altra classe, instancia la interf�cie i invoca el m�tode
		// amb un 3 com a par�metre i que retorni el triple d'aquest valor rebut.
		// imprimeix el resultat.

		// Definim el cos de la interfice
		PiFunctionalInterface metodoPi = () -> 3.1416;

		// Invoquem el m�tode
		System.out.println(metodoPi.getPiValue());
		
		
		
		
		
		
	}

}
