package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(7, 7, 7);					//passa-se 3 lados iguais
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());	//testa se equilatero
    }
    
    @Test 
    public void isoscelesTriangleHaveTwoEqualSides() throws Exception { 
        Triangle triangle = new Triangle(7, 7, 5);					//passa-se 2 lados iguais
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());	//testa se isosceles
    }
    
    @Test 
    public void scaleneTriangleHaveDifferentSides() throws Exception { 
        Triangle triangle = new Triangle(3, 4, 5); 				//passa-se 3 lados distintos
 
        assertEquals(TriangleKind.SCALENE, triangle.getKind());	//testa se escaleno
    }
    
    @Test 
    public void oneUniqueSides() throws Exception { 
        Triangle triangle = new Triangle(7, 7, 7); 
 
        assertEquals(1, triangle.getNumberOfUniqueSides());		//espera-se 1 lados diferentes
    }
    
    @Test 
    public void twoUniqueSides() throws Exception { 
        Triangle triangle = new Triangle(3, 7, 7); 
 
        assertEquals(2, triangle.getNumberOfUniqueSides());		//espera-se 2 lados diferentes
    }
    
    @Test 
    public void threeUniqueSides() throws Exception { 
        Triangle triangle = new Triangle(3, 4, 5); 
 
        assertEquals(3, triangle.getNumberOfUniqueSides());		//espera-se 3 lados diferentes
    }
    
}