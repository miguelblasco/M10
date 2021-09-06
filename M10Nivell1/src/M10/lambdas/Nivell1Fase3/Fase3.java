package M10.lambdas.Nivell1Fase3;

public class Fase3 {
	
	static int i = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos el cuerpo de la interfice
		reverseFunctionalInterface metodoReverse = (x) -> {
			
	        String result = "";
            for (i = x.length()-1; i >= 0 ; i--)
            result += x.charAt(i);
            return result;
        };
			
     // Invocamos al método
     		System.out.println(metodoReverse.revertirString("Barcelona"));		
			
		}	
	}


