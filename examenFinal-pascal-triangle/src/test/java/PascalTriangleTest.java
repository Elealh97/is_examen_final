/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle.PascalTriangle;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author chex
 */
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
    }
       
    @Test
    public void Prueba0() {
        // given
        int numero=0;
          PascalTriangle pt= new PascalTriangle();
       // when
        String ResultadoEsperado=Arrays.toString(new long[0]);       
        String ResultadoObtenido=pt.build(numero);
              
        // thenbuild
        assertEquals("Test 1", ResultadoEsperado, ResultadoObtenido);
    }
    
    @Test(expected = java.lang.OutOfMemoryError.class)
    public void PruebaFueradeRango() {
        // given
        String ResultadoEsperado = "";
        int input = Integer.MAX_VALUE;
        // when
        PascalTriangle pt = new PascalTriangle();
        String ResultadoObtenido = pt.build(input);
        // then
        assertEquals("Test 2", ResultadoEsperado, ResultadoObtenido);
}
    @Test
    public void PruebaNormal() {
        // given
        int input = 1;
        int ResultadoEsperado = 4;
        // when
        PascalTriangle pt = new PascalTriangle();
        int ResultadoObtenido = pt.build(input).length();
        // then
        assertEquals("Test 3", ResultadoEsperado, ResultadoObtenido);
    }
        
    @Test
    public void PruebaNivelesIguales(){
        int input = 4;
        int ResultadoEsperado = 4;
        // when
        PascalTriangle pt = new PascalTriangle();
        int ResultadoObtenido = pt.build(input).split("\n").length;

        // then
        assertEquals("test 4", ResultadoEsperado, ResultadoObtenido);
    }


    
  
}
