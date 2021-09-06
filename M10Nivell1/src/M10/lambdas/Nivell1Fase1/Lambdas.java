package M10.lambdas.Nivell1Fase1;

import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

	public List<String> cadenaNombres(List<String> lista, String empiezaCon, int longitud) {

		return lista.stream().filter(l -> l.startsWith(empiezaCon)).filter(l -> l.length() == longitud)
				.collect(Collectors.toList());
	}
	
	public String numerosConLetra(List<Integer> lista, int divisible, String separador) {
		return lista.stream().map(n -> (n % divisible == 0) ? "e" + n : "o" + n)
				.collect(Collectors.joining(separador));
	
	}
	
	public List<String> nombresConLetra(List<String> lista, String letra) {

		return lista.stream().filter(l -> l.contains(letra))
				.collect(Collectors.toList());
	}
	
	public List<String> nombresConLetraMasCincoLetras(List<String> lista, String letra, int minLetras) {

		return lista.stream().filter(l -> l.contains(letra) && l.length() > minLetras)
				.collect(Collectors.toList());
	}
}
