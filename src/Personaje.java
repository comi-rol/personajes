
class Personaje {
	
	int puntosDisponibles = 15;

	int puntosDeFuerza = 10;
	
	int calcularFuerza() {
		
		int modificadorFuerza = (puntosDeFuerza/2) - 5;

		return modificadorFuerza;
	}
	
	void canjearFuerza(int puntos) {
		
		int resultado = puntosDeFuerza + puntos;
		
		if ((puntosDisponibles >= puntos) && (resultado <= 18) && (resultado >= 7)) {
			
			puntosDisponibles = puntosDisponibles - puntos;
			
			puntosDeFuerza = resultado;
		}
	}
}
