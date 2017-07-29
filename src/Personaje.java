
class Personaje {
	
	private int puntosDisponibles = 15;
	
	private Puntuacion fuerza = new Puntuacion();
	
	private Puntuacion destreza = new Puntuacion();
	
	private Puntuacion constitucion = new Puntuacion();
	
	private Puntuacion inteligencia = new Puntuacion();
	
	private Puntuacion sabiduria = new Puntuacion();
	
	private Puntuacion carisma = new Puntuacion();
	
	private Raza raza;
	
	int calcularDisponibles() {
		
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
	
	int verFuerza() {
		
		int fuerzaTotal = fuerza.verValor();
		
		if (raza != null) {
			
			fuerzaTotal = fuerzaTotal + raza.verFuerza();
		}
		
		return fuerzaTotal;
	}
	
	int calcularDestreza() {
		
		return destreza.calcular();
	}
	
	void canjearDestreza(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - destreza.canjear(puntos);
		}
	}
	
	int verDestreza() {
		
		int destrezaTotal = destreza.verValor();
		
		if (raza != null) {
			
			destrezaTotal = destrezaTotal + raza.verDestreza();
		}
		
		return destrezaTotal;
	}
	
	int calcularConstitucion() {
		
		return constitucion.calcular();
	}
	
	void canjearConstitucion(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - constitucion.canjear(puntos);
		}
	}
	
	int verConstitucion() {
		
		int constitucionTotal = constitucion.verValor();
		
		if (raza != null) {
			
			constitucionTotal= constitucionTotal + raza.verConstitucion();
		}
		
		return constitucionTotal;
	}
	
	int calcularInteligencia() {
		
		return inteligencia.calcular();
	}
	
	void canjearInteligencia(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - inteligencia.canjear(puntos);
		}
	}
	
	int verInteligencia() {
		
		int inteligenciaTotal = inteligencia.verValor();
		
		if (raza != null) {
			
			inteligenciaTotal = inteligenciaTotal + raza.verInteligencia();
		}
		
		return inteligenciaTotal;
	}
	
	int calcularSabiduria() {
		
		return sabiduria.calcular();
	}
	
	void canjearSabiduria(int puntos) {
	
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - sabiduria.canjear(puntos);
		}
	}
	
	int verSabiduria() {
		
		int sabiduriaTotal = sabiduria.verValor();
		
		if (raza != null) {
			
			sabiduriaTotal = sabiduriaTotal + raza.verSabiduria();
		}
		
		return sabiduriaTotal;
	}
	
	int calcularCarisma() {
		 
		return carisma.calcular();
	}
	
	void canjearCarisma(int puntos) {
		
		if (puntosDisponibles >= puntos) {
			
			puntosDisponibles = puntosDisponibles - sabiduria.canjear(puntos);
		}
	}
	
	int verCarisma() {
		
		int carismaTotal = carisma.verValor();
		
		if (raza != null) {
			
			carismaTotal = carismaTotal + raza.verCarisma();
		}
		
		return carismaTotal;
	}
	
	void definirRaza(Raza razaElegida) {
		
		if (puntosDisponibles == 0) {
			
			raza = razaElegida;
		}
	}
	
	Raza verRaza () {
		
		return raza;
	}
	
}
