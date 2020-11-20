public class AsistenteCuchillos extends Cocinero {
	
	public AsistenteCuchillos (int bateria, String nombre, int id){
		super(bateria,nombre,id);
	}
	
	@Override
	public void cortar(){
		System.out.println(nombre + " esta cortando carnes y picando las verduras");
	}
	@Override
	public void cocinar(){}
	
	
}

