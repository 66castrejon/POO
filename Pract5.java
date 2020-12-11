
import java.io.*;
import java.util.*;

public class Pract5 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        int op,i=0;
        char resp='n';

        do {
            CapturaEntrada.Limpiar();	//limpia la pantalla en linea de comando
            Menu.Menu();
            op= CapturaEntrada.capturaEntero("Seleccione una");
            switch (op) {
                case 1:
                    banco.crearCuenta(i);
                    break;
                case 2:
                    CapturaEntrada.Limpiar();
                    banco.accederCuenta(CapturaEntrada.capturaEntero("No. de cuenta"));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            resp = CapturaEntrada.capturaChar("Realizar otra operacion? s/n");
            i++;
        } while (resp=='s');
    }
}

class CapturaEntrada{
	public static float capturaFloat(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return(sc.nextFloat());
    }
    
	public static String capturaString(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return(sc.nextLine());
    }
    
    public static int capturaEntero(String msg){
        Scanner sc =new Scanner(System.in);
        System.out.println(""+ msg + ": ");
        return(sc.nextInt());
	}

	public static char capturaChar(String msg){
        Scanner sc =new Scanner(System.in);
        System.out.println(""+ msg + ": ");
        return(sc.next().charAt(0));
  }


class Menu {
    public static void Menu(){
        System.out.println("POO Banco:");
        System.out.println("1.-Generar nueva cuenta");
        System.out.println("2.-Acceder a mi cuenta");
        System.out.println("3.-Salir");
    }

    public static void Menu2(){
        System.out.println("POO Banco:");
        System.out.println("1.-Consultar cuenta");
        System.out.println("2.-Depositos");
        System.out.println("3.-Retiros");
    }
}

class Banco{
    Cuenta cuenta[] = new Cuenta[15];
    public void crearCuenta(int i){
        CapturaEntrada.Limpiar();
        cuenta[i] =new  Cuenta(CapturaEntrada.capturaString("Nombre"),
                               CapturaEntrada.capturaEntero("No. de cuenta"),
                               CapturaEntrada.capturaFloat("Saldo"),
                               CapturaEntrada.capturaEntero("PIN"));
    }
	public void accederCuenta(int cont) {
        int i;
        for (i=0;i<cuenta.length;i++){
            if(cuenta[i].getNumCuenta()==cont){
                ingresarPin(i);
            }else{
                System.out.println("Cuenta no registrada");

            }
        }
    }

    public void ingresarPin(int position){
        int op;
        char resp='n';
        CapturaEntrada.Limpiar();
        while (cuenta[position].getPin()!=CapturaEntrada.capturaEntero("Capturar PIN "));
        do{
            CapturaEntrada.Limpiar();
            Menu.Menu2();	
            op= CapturaEntrada.capturaEntero("Opcion");
            switch (op) {
                case 1:
                    mostrearCuenta(position);
                    break;
                case 2:
                    depositarDinero(position);
                    break;
                case 3:
                    if(cuenta[position].getSaldo()>0){
                        retirarDinero(position);
                    }else{
                        System.out.println("Cuenta sin saldo");
                    }
                    break;
                default:
                    break;
            }
            resp = CapturaEntrada.capturaChar("Realizar otra operacion? s/n");
            CapturaEntrada.Limpiar();
        }while(resp=='s');
    }
    public void mostrearCuenta(int position){
        CapturaEntrada.Limpiar();
        System.out.println("Nombre: "+cuenta[position].getName());
        System.out.println("No. de cuenta: "+cuenta[position].getNumCuenta());
        System.out.println("Saldo: "+cuenta[position].getSaldo());
    }

    public void depositarDinero(int position){
        CapturaEntrada.Limpiar();
        cuenta[position].setSaldo(CapturaEntrada.capturaFloat("Cantidad a depositar: ")+cuenta[position].getSaldo());
        System.out.println("Operacion exitosa");
    }

    public void retirarDinero(int position){
        float retiro;
        CapturaEntrada.Limpiar();
        retiro=CapturaEntrada.capturaFloat("Cantidad a retirar: ");

        if(cuenta[position].getSaldo()>=retiro){	//verificar si el retiro es valido 
            cuenta[position].setSaldo(cuenta[position].getSaldo()-retiro);
            System.out.println("Retiro con exito");
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }
}


class Cuenta {
    private String name;
    private int numCuenta;
    private int pin;
    private float saldo;

    public Cuenta(String name, int numCuenta, float saldo, int pin) {
        this.name = name;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.pin=pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

	public int length() {
		return 0;
	}
}

public static void Limpiar() {
    try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception e) {
    }
  }
}



