import java.util.Scanner;

public class Principal {

	
	static Scanner scanner = new Scanner(System.in);
	
	public static  void principal(String[] args) {
		
	System.out.println("Bienvenido a Street Rod, Cual es su nombre");
	
	String name = scanner.nextLine();
	int dineroDisponible = 750;

	Jugador jugador = new Jugador(name, dineroDisponible);
		
		
		
		
	}
}