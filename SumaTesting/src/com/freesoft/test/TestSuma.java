package com.freesoft.test;

import com.freesoft.rn.Suma;

import junit.framework.TestCase;

public class TestSuma extends TestCase {

	public static void main(String[] args) {
		// Este sera el 3er commit
		Suma suma = new Suma();
		double a = 1.0;
		double b = 1.2;
		double resultado = suma.sumar(a, b);
		assertEquals("Resultado de: 1.0 + 1.2  = 2.2", 2.2, resultado);
	}

}
