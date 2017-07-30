
class Personaje {
	
	private int puntosDisponibles = 15;
	
	private Puntuacion fuerza = new Puntuacion();
	
	private Puntuacion destreza = new Puntuacion();
	
	private Puntuacion constitucion = new Puntuacion();
	
	private Puntuacion inteligencia = new Puntuacion();
	
	private Puntuacion sabiduria = new Puntuacion();
	
	private Puntuacion carisma = new Puntuacion();
	
	private Puntuacion caracteristicaConAdicionales = null;
	
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
			
			if (caracteristicaConAdicionales == fuerza) {
				
				fuerzaTotal = fuerzaTotal + raza.verAdicional();
			}
		}
		
		return fuerzaTotal;
	}
	
	void recibirAdicionalesEnFuerza() {
		
		caracteristicaConAdicionales = fuerza;
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
		
			if(caracteristicaConAdicionales == destreza) {
				
				destrezaTotal = destrezaTotal + raza.verAdicional();
			}
		}
		
		return destrezaTotal;
	}
	
	void recibirAdicionalesEnDestreza() {
		
		caracteristicaConAdicionales = destreza;
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
			
			if (caracteristicaConAdicionales == constitucion) {
				
				constitucionTotal = constitucionTotal + raza.verAdicional();
			}
		}
		
		return constitucionTotal;
	}
	
	void recibirAdicionalesEnConstitucion() {
		
		caracteristicaConAdicionales = constitucion;
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
			
			if (caracteristicaConAdicionales == inteligencia) {
				
				inteligenciaTotal = inteligenciaTotal + raza.verAdicional(); 
			}
		}
		
		return inteligenciaTotal;
	}
	
	void recibirAdicionalesEnInteligencia() {
		
		caracteristicaConAdicionales = inteligencia;
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
			
			if (caracteristicaConAdicionales == sabiduria) {
				
				sabiduriaTotal = sabiduriaTotal + raza.verAdicional();
			}
		}
		
		return sabiduriaTotal;
	}
	
	void recibirAdicionalesEnSabiduria() {
		
		caracteristicaConAdicionales = sabiduria;
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
			
			if (caracteristicaConAdicionales == carisma) {
				
				carismaTotal = carismaTotal + raza.verAdicional();
			}
		}
		
		return carismaTotal;
	}
	
	void recibirAdicionalesEnCarisma() {
		
		caracteristicaConAdicionales = carisma;
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
