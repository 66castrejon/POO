import java.util.Scanner;
import java.util.InputMismatchException;

public class Pract7 {
	public static void main(String[] args){

	Cocinero robot = new Chef(95,"Juan",8);
	Cocinero robot1 = new AsistenteCuchillos(72,"Gerardo",26);
	Cocinero robot2 = new AsistenteParrilla(50,"Valeria",01);
	

	Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion; //Guardaremos la opcion del usuario
	boolean aux1;
	boolean aux2;
	aux1 = aux2 = false;
	
	while (!salir) {
		System.out.println("1. Chef");
        System.out.println("2. Picador");
        System.out.println("3. Cocinero");
        System.out.println("4. Salir");
		
		try{
			System.out.println("Seleccione robot");
            opcion = sn.nextInt();
			
			switch (opcion){
				
				case 1:
					if(aux1 == true && aux2 == true){
						robot.servir();
						System.out.println("Bon Jour, soy el Chef provecho!");
						System.out.println("Nombre: " + robot.nombre);
						System.out.println("ID: " + robot.id);
						System.out.println("Bateria: " + robot.bateria);
						salir = true;
						}
					else{
						System.out.println("Verifica que no falte nada antes de servir!!");
					}break;
				
				case 2:
					robot1.cortar();
					System.out.println("Hola, yo me encargare de dejar todos los ingredientes listos con mis cuchillos!");
					System.out.println("Nombre: " + robot1.nombre);
					System.out.println("ID: " + robot1.id);
					System.out.println("Bateria: " + robot1.bateria);
					aux1 = true;
					break;
				
				case 3:
					if(aux1 == false){
						System.out.println("Como vas a cocinar sin ingredientes??");
					}
					else{
					robot2.cocinar();
					System.out.println("Alo, deja cocino tu comida a la temperatura adecuada!");
					System.out.println("Nombre: " + robot2.nombre);
					System.out.println("ID: " + robot2.id);
					System.out.println("Bateria: " + robot2.bateria);
					aux2 = true;
					}break;
					
				case 4:
					salir = true;
					break;
                default:
					System.out.println("Error ");
			}

		}catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
		}	
	}
  }
}



