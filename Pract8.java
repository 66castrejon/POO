
public class Pract8 {
	public static void main(String[] args){
		
		Empleado emp []  = new Empleado[5];
		
		emp[0] = new Asalariado("Gerardo", 1500);
		emp[1] = new Hora("Juan", 5000, 4);
		emp[2] = new Comision("Pedro", 4000, 20);
		emp[3] = new Comision("Carlos", 2500, 12);
		emp[4] = new Hora("Ricardo", 3000, 7);
		
		for(Empleado a: emp){
			a.pago();
		}
	}
}



