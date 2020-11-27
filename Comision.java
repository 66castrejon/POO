public class Comision extends Empleado{
	
	int ventas;
	
	public Comision(String nombre, double sueldo, int ventas){
		super(nombre,sueldo);
		
		this.ventas = ventas;
	}
	
	public int getVentas() { return ventas; }

	
	public void pago(){
		System.out.println("\nNombre: " + nombre + "\nEmpleado por comisiones" + "\nSueldo: " + sueldo + "\nVentas de la semana: " + ventas );
		if (ventas > 0)
			System.out.println("Recompensa del 10% de sueldo: " + sueldo*.10);
			sueldo = sueldo + (sueldo * 0.10);
			sueldo = sueldo + ventas*25;
			
			System.out.println("Sueldo final: " + sueldo);
	}	
}