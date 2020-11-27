
public class Empleado{
	
	String nombre;
	double sueldo;
	
	public Empleado(String nombre, double sueldo){
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String getNombre() { return nombre; }
	public double getSueldo() { return sueldo; }
	
	
	public void pago(){
		System.out.println("Pago de empleado");
	}	
}




