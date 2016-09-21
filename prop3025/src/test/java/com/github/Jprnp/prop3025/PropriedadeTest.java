package com.github.Jprnp.prop3025;

import static org.junit.Assert.*;

import org.junit.Test;

public class PropriedadeTest {

	@Test(expected = IllegalArgumentException.class)
	 public void menorQueZero() {
		 Propriedade.testeProp(-5);
	 }
	
	@Test(expected = IllegalArgumentException.class)
	 public void maiorQueOLimite() {
		 Propriedade.testeProp(12345);
	 }
	
	@Test
	public void possuiProp() {
		assertEquals(true, Propriedade.testeProp(3025));
	}
	
	@Test
	public void naoPossuiProp() {
		assertEquals(false, Propriedade.testeProp(3026));
	}
	
	@Test
	public void cemPorCento() {
		new Propriedade();
	}

}
