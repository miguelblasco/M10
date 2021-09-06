package M10.lambdas.Nivell1Fase1;

public class Fase1 {
	
	Listas c00 = new Listas();
	Lambdas c01 = new Lambdas();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fase1 c02 = new Fase1();
		
		c02.ej1();
		c02.ej2();
		c02.ej3();
		c02.ej4();
		c02.ej5();
		c02.ej6();
		
	}

		private void ej1() {
			
			System.out.println("--- Ej1 ---");
			c01.cadenaNombres(c00.nombres, "A", 3).forEach(System.out::println);
	}
		
		private void ej2() {

			System.out.println("--- Ej2 ---");
			System.out.println(c01.numerosConLetra(c00.numeros,2," , "));

		}
		
		private void ej3() {
		
			System.out.println("--- Ej3 ---");
			c01.nombresConLetra(c00.nombres, "o").forEach(v -> System.out.println(v));

		}
		
		private void ej4() {
		
			System.out.println("--- Ej4 ---");
			c01.nombresConLetraMasCincoLetras(c00.nombres, "o", 5).forEach(v -> System.out.println(v));

		}
		
		private void ej5() {

			System.out.println("--- Ej5 ---");
			c00.mesosAny.stream().forEach(v -> System.out.println(v));
		}
		
		private void ej6() {
			
			System.out.println("--- Ej6 ---");
			c00.mesosAny.stream().forEach(System.out::println);
		}
}
