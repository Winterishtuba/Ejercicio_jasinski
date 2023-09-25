
public abstract class Auto {

	private String nombre;
	private int precio;
	private int velocidadMaxima;
	private Parte motor;
	private Parte transmision;
	
	public Auto(String nombre, int precio, int velocidadMaxima, Parte motor, Parte transmision) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.velocidadMaxima = velocidadMaxima;
		this.motor = motor;
		this.transmision = transmision;
	}
	

}
