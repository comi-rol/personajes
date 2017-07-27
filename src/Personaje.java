
class Personaje {
	
	private int puntosDisponibles = 15;
	
	private Puntuacion fuerza = new Puntuacion();
	
	private Puntuacion destreza = new Puntuacion();
	
	private Puntuacion constitucion = new Puntuacion();
	
	private Puntuacion inteligencia = new Puntuacion();
	
	private Puntuacion sabiduria = new Puntuacion();
	
	private Puntuacion carisma = new Puntuacion();
	
	int calcularDiponibles() {
		
		return puntosDisponibles;
	}
	
	int calcularFuerza() {
		
		return fuerza.calcular();
	}
	
	void canjearFuerza(int puntos) {
		
		if(puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - fuerza.canjear(puntos);
		}
	}
	
	int calcularDestreza() {
		
		return destreza.calcular();
	}
	
	void canjearDestreza(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - destreza.canjear(puntos);
		}
	}
	
	int calcularConstitucion() {
		
		return constitucion.calcular();
	}
	
	void canjearConstitucion(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - constitucion.canjear(puntos);
		}
	}
	
	int calcularInteligencia() {
		
		return inteligencia.calcular();
	}
	
	void canjearInteligencia(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - inteligencia.canjear(puntos);
		}
	}
	
	int calcularSabiduria() {
		
		return sabiduria.calcular();
	}
	
	void canjearSabiduria(int puntos) {
	
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - sabiduria.canjear(puntos);
		}
	}
	
	int calcularCarisma() {
		 
		return carisma.calcular();
	}
	
	void canjearCarisma(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - sabiduria.canjear(puntos);
		}
	}
}
