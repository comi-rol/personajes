

import org.junit.Assert;
import org.junit.Test;

public class PersonajeTest {
	
	private Catalogo catalogo = new Catalogo();

	@Test
	public void seCreaConTodosSusModificadoresEnCero() {
		
		Personaje jaime = new Personaje();
		
		Assert.assertEquals("fuerza", 0, jaime.calcularFuerza());
		Assert.assertEquals("destreza", 0, jaime.calcularDestreza());
		Assert.assertEquals("constitucion", 0, jaime.calcularConstitucion());
		Assert.assertEquals("inteligencia", 0, jaime.calcularInteligencia());
		Assert.assertEquals("sabiduria", 0, jaime.calcularSabiduria());
		Assert.assertEquals("carisma", 0, jaime.calcularCarisma());
	}
	
	@Test
	public void canjearMenos2enFuerzaCambiaLosPuntosDisponiblesA17YLaPuntuacionFuerzaA8() {
		
		Personaje alex = new Personaje();
		
		alex.canjearFuerza(-2);
		
		Assert.assertEquals("puntosDisponibles", 17, alex.calcularDisponibles());
		Assert.assertEquals("puntuacionFuerza", 8, alex.verFuerza());
	}
	
	@Test
	public void asignarRazaGnomoDejaFuerzaCon8PuntosYConstitucionYCarismaCon12Puntos() {
		
		Personaje mabel = new Personaje();
		
		mabel.canjearDestreza(3);
		mabel.canjearInteligencia(7);
		mabel.canjearSabiduria(5);
		
		Raza gnomo = catalogo.GNOMO;
		
		mabel.definirRaza(gnomo);
		
		Assert.assertEquals("puntosFuerza", 8, mabel.verFuerza());
		Assert.assertEquals("puntosConstitucion", 12, mabel.verConstitucion());
		Assert.assertEquals("puntosSabiduria", 12, mabel.verCarisma());
	}
	
	@Test
	public void asignarRazaElfoDejaConstitucionCon8PuntosYDestrezaEInteligenciaCon12Puntos() {
		
		Personaje bill = new Personaje();
		
		bill.canjearFuerza(3);
		bill.canjearSabiduria(7);
		bill.canjearCarisma(5);
		
		bill.definirRaza(catalogo.ELFO);
		
		Assert.assertEquals("puntosDestreza", 12, bill.verDestreza());
		Assert.assertEquals("puntosConstitucion", 8, bill.verConstitucion());
		Assert.assertEquals("puntosInteligencia", 12, bill.verInteligencia());
	}
	
	@Test
	public void asignarRazaHumanoYDarPuntosAdicionalesAFuerzaTieneQueDejarFuerzaCon12Puntos() {
		
		Personaje stan = new Personaje();
		
		stan.canjearDestreza(5);
		stan.canjearInteligencia(5);
		stan.canjearCarisma(5);
		
		stan.definirRaza(catalogo.HUMANO);
		
		stan.recibirAdicionalesEnFuerza();
		
		Assert.assertEquals(12, stan.verFuerza());
	}
	
	@Test
	public void alCambiarDeRazaConPtosAdicionalesEstosNoSeConservan() {
		
		Personaje stan = new Personaje();
		
		stan.canjearDestreza(5);
		stan.canjearInteligencia(5);
		stan.canjearCarisma(5);
		
		stan.definirRaza(catalogo.HUMANO);
		
		stan.recibirAdicionalesEnFuerza();
		
		stan.definirRaza(catalogo.ENANO);
		
		Assert.assertEquals(10, stan.verFuerza());
	}
	
	@Test
	public void laRecepcionDeAdicionalesSeConservaLuegoDeCambiarEntreRazas() {
		
		Personaje sheldom = new Personaje();
		
		sheldom.canjearDestreza(5);
		sheldom.canjearInteligencia(5);
		sheldom.canjearCarisma(5);
		
		sheldom.definirRaza(catalogo.HUMANO);
		sheldom.recibirAdicionalesEnFuerza();
		sheldom.definirRaza(catalogo.ENANO);
		sheldom.definirRaza(catalogo.HUMANO);
		
		Assert.assertEquals(12, sheldom.verFuerza());
	}
}
