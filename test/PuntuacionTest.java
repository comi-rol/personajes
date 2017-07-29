
import org.junit.Assert;
import org.junit.Test;

public class PuntuacionTest {
	
	@Test
	public void empiezaConValorDiez() {
		
		Puntuacion fuerza = new Puntuacion();
		
		Assert.assertEquals("valor", 10, fuerza.verValor());
	}
	
	@Test
	public void canjearCuatroNoCambiaElValor() {
		
		Puntuacion unaPuntuacion = new Puntuacion();
		
		unaPuntuacion.canjear(4);
		
		Assert.assertEquals(10, unaPuntuacion.verValor());
	}
	
	@Test
	public void canjear13CambiaValorA17() {
		
		Puntuacion unaPuntuacion = new Puntuacion();
		
		unaPuntuacion.canjear(13);
		
		Assert.assertEquals(17,unaPuntuacion.verValor());
	}
	
	@Test
	public void  calcularModificadorPara17Es3() {
		
		Puntuacion unaPuntuacion = new Puntuacion();
		
		unaPuntuacion.canjear(13);
		
		Assert.assertEquals(3,unaPuntuacion.calcular());
	}
}
