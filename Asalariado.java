public class Asalariado extends Empleado{
	
	public Asalariado(String nombre, double sueldo){
		super(nombre,sueldo);
		
	}
	
	public void pago(){
		System.out.println("\nNombre: " + nombre + "\nEmpleado asalariado" + "\nSueldo: " + sueldo );
	}	
}

