
class Personaje {
	
	int puntosDisponibles = 15;

	int puntosDeFuerza = 10;
	
	int calcularFuerza() {
		
		int modificadorFuerza = (puntosDeFuerza/2) - 5;

		return modificadorFuerza;
	}
	
	void canjearFuerza(int puntos) {
		
		int resultado = puntosDeFuerza + puntos;
		
		if ((puntosDisponibles >= puntos) && (resultado >= 6) && (resultado <= 27)) {
			
			if (puntos == -4) {
				
				puntosDeFuerza = resultado + 1;
				
				puntosDisponibles = puntosDisponibles - puntos;
				
			} else if ((puntos >= -2) && (puntos <= 3)) {
				
				puntosDeFuerza = resultado;
				
				puntosDisponibles = puntosDisponibles - puntos;
			
			} else if (puntos == 5) {
				
				puntosDeFuerza = resultado - 1; 
				
				puntosDisponibles = puntosDisponibles - puntos;
			
			} else if (puntos == 7) {
				
				puntosDeFuerza = resultado - 2;
				
				puntosDisponibles = puntosDisponibles - puntos;
			
			} else if (puntos == 10) {
				
				puntosDeFuerza = resultado - 4;
				
				puntosDisponibles = puntosDisponibles - puntos;
			
			} else if (puntos == 13) {
				
				puntosDeFuerza = resultado - 6;
				
				puntosDisponibles = puntosDisponibles - puntos;
			
			} else if (puntos == 17) {
				
				puntosDeFuerza = resultado - 9;
				
				puntosDisponibles = puntosDisponibles - puntos;
			}
		}
	}
}
