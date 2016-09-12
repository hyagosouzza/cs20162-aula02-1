package com.github.Jprnp.somanaturais;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SomaNaturaisTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SomaNaturaisTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SomaNaturaisTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testOk() {
    	SomaNaturais.soma(5);
    }
    public void cemPorCento() {
    	new SomaNaturais();
    }
}
