package com.github.Jprnp.multiplicacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicacaoTest {

	@Test(expected = IllegalArgumentException.class)
	 public void menorQueZero() {
		 Multiplicacao.getProduto(-1, 2);
	 }
	
	@Test(expected = IllegalArgumentException.class)
	 public void outroMenorQueZero() {
		 Multiplicacao.getProduto(1, -1);
	 }
	
	@Test(expected = IllegalArgumentException.class)
	 public void bothMenorQueZero() {
		 Multiplicacao.getProduto(-1, -1);
	 }
	 
	 @Test
	 public void multQualquer() {
		 assertEquals(15, Multiplicacao.getProduto(3, 5));
	 }
	 
	 @Test
	 public void multInv() {
		 assertEquals(15, Multiplicacao.getProduto(5, 3));
	 }
	 
	 @Test
	 public void cemPorCento() {
		 new Multiplicacao();
	 }
}

