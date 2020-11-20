
public abstract class Cocinero implements Orden{
	int bateria;
	String nombre;
	int id;
	
	public Cocinero (int bateria, String nombre, int id){
		this.bateria = bateria;
		this.nombre = nombre;
		this.id = id;
	}
	
	public int getBateria() { return bateria; }
	public String getNombre() { return nombre; }
	public int getId() { return id; }
	
	public abstract void cortar();
	public abstract void cocinar();
	
	public void servir(){
		System.out.println("PLATILLO LISTO!!!");
		System.out.println(nombre + " sirve la comida");
	}

	
	public boolean ingredientesPicados(){
		return false;
	}
	public boolean comidaLista(){
		return false;
	}
}

