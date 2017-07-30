
class Puntuacion {
	
	private int valor = 10;
	
	int canjear (int puntos) {
		
		int puntosCanjeados = 0;
		
		int resultado = valor + puntos;
		
		if ((resultado >= 6) && (resultado <= 27)) {
			
			puntosCanjeados = puntos;
			
			if (puntos == -4) {
				
				valor = resultado + 1;
							
			} else if ((puntos >= -2) && (puntos <= 3)) {
				
				valor = resultado;
							
			} else if (puntos == 5) {
				
				valor = resultado - 1; 
							
			} else if (puntos == 7) {
				
				valor = resultado - 2;
				
			} else if (puntos == 10) {
				
				valor = resultado - 4;
							
			} else if (puntos == 13) {
				
				valor = resultado - 6;				
			
			} else if (puntos == 17) {
				
				valor = resultado - 9;
			} else {
				
				puntosCanjeados = 0;
			}
		} 
		
		return puntosCanjeados;
	}
	
	int verValor() {
		
		return valor;
	}
}
