package test.data_structures;
import static org.junit.Assert.*;


import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico <Integer> arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico <Integer>(TAMANO);
	}

	public void setUp2() {
		setUp1(); 
		for(Integer i =0; i< TAMANO*2; i++){
			arreglo.agregar(i);
		}
	}

	@Test
	public void testArregloDinamico() {
		setUp1();
	}

	@Test
	public void testDarElemento() {
		setUp2();
		Integer x = arreglo.darElemento(34);
		assertTrue("El valor es incorrecto",x==34);
		
	}

}
