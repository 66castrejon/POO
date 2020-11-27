public class Hora extends Empleado{
	
	int horasExtras;
	
	public Hora(String nombre, double sueldo, int horasExtras){
		super(nombre,sueldo);
		
		this.horasExtras = horasExtras;
	}
	
	public int getHorasExtras() { return horasExtras; }
	
	
	public void pago(){
		System.out.println("\nNombre: " + nombre + "\nEmpleado por horas" + "\nSueldo: " + sueldo + "\nHoras extras: " + horasExtras );
		if (horasExtras > 0)
			sueldo = sueldo + ((sueldo/40) * horasExtras* 2);
			System.out.println("Sueldo final: " + sueldo);
		
	}	
}