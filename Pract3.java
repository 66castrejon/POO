

import java.io.*;
import java.util.*;


public class Pract3 {
	public static void main(String[] args) {
		
	Persona pe1 = new Persona(CapturaEntrada.capturaString("Primer nombre"),CapturaEntrada.capturaString("Segundo nombre(en caso de no tener dejar este espacio en blanco)"),CapturaEntrada.capturaString("Apellido paterno"),CapturaEntrada.capturaString("Apellido materno"),CapturaEntrada.capturarEntero("Fecha de nacimiento (formato AAMMDD)"),CapturaEntrada.capturaString("Sexo (Hombre o Mujer?)"));
	String nom1,nom2,ape1,ape2, genero;
	int fecha;
	nom1 = pe1.nombre1;
	nom2 = pe1.nombre2;
	ape1 = pe1.apellido1;
	ape2 = pe1.apellido2;
	genero = pe1.sexo;
	fecha = pe1.fecha;
	Random rnd = new Random();//numeros random
	int valorRandom = rnd.nextInt(9)+1;
	int caracterRandom = rnd.nextInt(26);//Caracter random necesario para el RFC
	String [] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
	int i,j=1,k=1,l=1,m;; //variables que seran usadas para establecer el esapcio de las vocales y consonantes
	
	/*Busqueda de vocal y consonantes, por alguna razon el do while no me funcionaba de manera correcta para la vocal
	asi que implemente un ciclo for que tuviera un break cuando encontrara la vocal que se necesita*/
	for(i=1;i<15;i++){
		if(ape1.charAt(i)=='a'||ape1.charAt(i)=='A'||ape1.charAt(i)=='e'||ape1.charAt(i)=='E'||ape1.charAt(i)=='i'||ape1.charAt(i)=='I'||ape1.charAt(i)=='o'||ape1.charAt(i)=='O'||ape1.charAt(i)=='u'||ape1.charAt(i)=='U')
			break;
	}
	do{
		if(ape1.charAt(j)=='a'||ape1.charAt(j)=='A'||ape1.charAt(j)=='e'||ape1.charAt(j)=='E'||ape1.charAt(j)=='i'||ape1.charAt(j)=='I'||ape1.charAt(j)=='o'||ape1.charAt(j)=='O'||ape1.charAt(j)=='u'||ape1.charAt(j)=='U')
			j++;
	}while(j==ape1.length());
	do{
		if(ape2.charAt(k)=='a'||ape2.charAt(k)=='A'||ape2.charAt(k)=='e'||ape2.charAt(k)=='E'||ape2.charAt(k)=='i'||ape2.charAt(k)=='I'||ape2.charAt(k)=='o'||ape2.charAt(k)=='O'||ape2.charAt(k)=='u'||ape2.charAt(k)=='U')
			k++;
	}while(k==ape2.length());
	do{
		if(nom1.charAt(l)=='a'||nom1.charAt(l)=='A'||nom1.charAt(l)=='e'||nom1.charAt(l)=='E'||nom1.charAt(l)=='i'||nom1.charAt(l)=='I'||nom1.charAt(l)=='o'||nom1.charAt(l)=='O'||nom1.charAt(l)=='u'||nom1.charAt(l)=='U')
			l++;
	}while(l==nom1.length());


	pe1.setCurp(""+ape1.charAt(0)+ape1.charAt(i)+ape2.charAt(0)+nom1.charAt(0)+fecha+genero.charAt(0)+"BC"+ape1.charAt(j)+ape2.charAt(k)+nom1.charAt(l)+valorRandom+valorRandom);
	pe1.setRfc(""+ape1.charAt(0)+ape1.charAt(1)+ape2.charAt(0)+nom1.charAt(0)+fecha+abc[caracterRandom]+abc[caracterRandom]+valorRandom);
	
	String mayusculaCurp, mayusculaRfc;
	mayusculaCurp = pe1.curp;
	mayusculaRfc = pe1.rfc;
	
	boolean salir = false;
    int opcion;
	Scanner sc = new Scanner (System.in);
	while (!salir) {	
	System.out.println("\nMenu principal");
	System.out.println("1. Obtener CURP");
	System.out.println("2. Obtener el RFC");
	System.out.println("3. Obtener RFC y CURP");
	System.out.println("4. Salir");
	
	opcion = sc.nextInt();
 
		switch (opcion) {
			case 1: System.out.println("CURP:" + mayusculaCurp.toUpperCase());	
					break;
							
			case 2:	System.out.println("RFC:" + mayusculaRfc.toUpperCase());
					break;
				  
			case 3:	System.out.println("CURP: " + mayusculaCurp.toUpperCase() +"\nRFC: "+ mayusculaRfc.toUpperCase());
					break;
						
			case 4:	System.out.println("Adios");
					salir = true;
					break;
			default:System.out.println("\nOpcion no valida\n");
		}
	}	
	}
}


class Persona{
	String nombre1, nombre2, apellido1, apellido2, sexo, curp, rfc;
	int fecha;
	public Persona(String nombre1, String nombre2, String apellido1, String apellido2, int fecha, String sexo){
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fecha = fecha;
		this.sexo = sexo;
	}
	public String getNombre1(){return nombre1;}
	public void setNombre1(String nombre1){this.nombre1 = nombre1;}
	public String getNombre2(){return nombre2;}
	public void setNombre2(String nombre2){this.nombre2 = nombre2;}
	public String getApellido1(){return apellido1;}
	public void setApellido1(String apellido1){this.apellido1 = apellido1;}
	public String getApellodo2(){return apellido2;}
	public void setApellido2(String apellido2){this.apellido2 = apellido2;}
	public int getFecha(){return fecha;}
	public void setFecha(int fecha){this.fecha = fecha;}
	public String getSexo(){return sexo;}
	public void setSexo(String sexo){this.sexo = sexo;}
	public String getCurp(){return curp;}
	public void setCurp(String curp){this.curp = curp;}
	public String getRfc(){return rfc;}
	public void setRfc(String rfc){this.rfc = rfc;}	
}

class CapturaEntrada{
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return (sc.nextInt());
    }
    public static float capturaFloat(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return(sc.nextFloat());
    }
    public static String capturaString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return(sc.nextLine());
    }
}