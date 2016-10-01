package com.github.Jprnp.NumeroPrimo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.Jprnp.NumeroPrimo.Primo;

public class PrimoTest {
	
	@Test(expected = IllegalArgumentException.class)
	 public void menorQueZero() {
		 Primo.isPrimo(-5);
	 }

	@Test
	public void ePrimo() {
		assertEquals(true, Primo.isPrimo(7));
	}
	
	@Test
	public void naoEPrimo() {
		assertEquals(false, Primo.isPrimo(6));
	}
	
	@Test
	public void cemPorCentoDeCobertura() {
		new Primo();
	}
}
