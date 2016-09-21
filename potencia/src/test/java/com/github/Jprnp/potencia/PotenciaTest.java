package com.github.Jprnp.potencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PotenciaTest {

	@Test(expected = IllegalArgumentException.class)
	public void baseMenorQueZero() {
		Potencia.doPow(-1, 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void expMenorQueZero() {
		Potencia.doPow(2, -1);
	}
	
	@Test
	public void testeMaroto() {
		assertEquals(64, Potencia.doPow(2, 6));
	}
	
	@Test
	public void cemPorCento() {
		new Potencia();
	}

}
