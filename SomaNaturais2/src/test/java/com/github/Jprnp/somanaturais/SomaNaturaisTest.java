package com.github.Jprnp.somanaturais;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SomaNaturaisTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	 @Test(expected = IllegalArgumentException.class)
	 public void diaMenorQueUmInvalido() {
		 SomaNaturais.soma(-1);
	 }
	 
	 @Test
	 public void somaQualquer() {
		 assertEquals(3, SomaNaturais.soma(2));
	 }
	 
	 @Test
	 public void somaZero() {
		 assertEquals(0, SomaNaturais.soma(0));
	 }
	 
	 @Test
	 public void cemPorCento() {
		 new SomaNaturais();
	 }
}
