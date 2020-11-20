public class AsistenteParrilla extends Cocinero{
	
	public AsistenteParrilla(int bateria, String nombre, int id){ 
		super(bateria,nombre,id);
	}
	
	@Override
	public void cocinar(){
		System.out.println(nombre + " esta preparando el platillo");
	}
	@Override
	public void cortar(){}

}