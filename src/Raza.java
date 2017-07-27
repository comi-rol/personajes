
class Raza {
	
	private String nombre;
	private int fuerza;
	private int destreza;
	private int constitucion;
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	private int adicional;
	
	Raza(String nombreDeLaRaza, 
			int fuerzaDada, int destrezaDada, int constitucionDada,
			int inteligenciaDada, int sabiduriaDada, int carismaDado, 
			int adicionalDado) {
		
		nombre = nombreDeLaRaza;
		fuerza = fuerzaDada;
		destreza = destrezaDada;
		constitucion = constitucionDada;
		inteligencia = inteligenciaDada;
		sabiduria = sabiduriaDada;
		carisma = carismaDado;
		adicional = adicionalDado;
	}
	
	int verFuerza() {
		
		return fuerza;
	}
	
	int verDestreza() {
		
		return destreza;
	}
	
	int verConstitucion() {
		
		return constitucion;
	}
	
	int verInteligencia() {
		
		return inteligencia;
	}
	
	int verSabiduria() {
		
		return sabiduria;
	}
	
	int verCarisma() {
		
		return carisma;
	}
	
	int verAdicional() {
		
		return adicional;
	}
	
	public String toString() {
		
		return nombre;
	}
}	
