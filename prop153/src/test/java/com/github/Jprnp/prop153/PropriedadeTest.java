package com.github.Jprnp.prop153;

import static org.junit.Assert.*;

import org.junit.Test;

public class PropriedadeTest {

	@Test(expected = IllegalArgumentException.class)
	 public void menorQueZero() {
		 Propriedade.testeProp(-5);
	 }
	
	@Test(expected = IllegalArgumentException.class)
	 public void maiorQueOLimite() {
		 Propriedade.testeProp(1234);
	 }
	
	@Test
	public void possuiProp() {
		assertEquals(true, Propriedade.testeProp(153));
	}
	
	@Test
	public void naoPossuiProp() {
		assertEquals(false, Propriedade.testeProp(152));
	}
	
	@Test
	public void cemPorCento() {
		new Propriedade();
	}

}
