/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble.BubbleSort;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author chex
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
   
    @Test
    public void PruebaNulo() {
        // given
        int[] numero=null;
          BubbleSort bs= new BubbleSort();
       // when     
         int[] ResultadoObtenido=BubbleSort.sortBasic(numero);              
        // thenbuild
        Assert.assertArrayEquals("Test 1", null, ResultadoObtenido);
    }
    
    
       @Test
    public void Prueba0() {
        // given
        int[] numero=new int[]{0};;
          BubbleSort bs= new BubbleSort();
           int[] ResultadoEsperado= new int[]{0};
       // when     
         int[] ResultadoObtenido=BubbleSort.sortBasic(numero);              
        // thenbuild
        Assert.assertArrayEquals("Test 2", ResultadoEsperado, ResultadoObtenido);
    }
    
    @Test
     public void PruebaCadenaLarga() {
        // given
        int[] numero=new int[]{0,6,8,2,1,7};;
          BubbleSort bs= new BubbleSort();
           int[] ResultadoEsperado= new int[]{0,1,2,6,7,8};
       // when     
         int[] ResultadoObtenido=BubbleSort.sortBasic(numero);              
        // thenbuild
        Assert.assertArrayEquals("Test 3", ResultadoEsperado, ResultadoObtenido);
    }
     
        @Test
      public void PruebaDigitosRepetidos() {
        // given
        int[] numero=new int[]{0,6,0,2,2,6};;
          BubbleSort bs= new BubbleSort();
           int[] ResultadoEsperado= new int[]{0,0,2,2,6,6};
       // when     
         int[] ResultadoObtenido=BubbleSort.sortBasic(numero);              
        // thenbuild
        Assert.assertArrayEquals("Test 4", ResultadoEsperado, ResultadoObtenido);
    }
      
          @Test
      public void PruebaDigitosVacio() {
        // given
        int[] numero=new int[]{};;
          BubbleSort bs= new BubbleSort();
           int[] ResultadoEsperado= new int[]{};
       // when     
         int[] ResultadoObtenido=BubbleSort.sortBasic(numero);              
        // thenbuild
        Assert.assertArrayEquals("Test 5", ResultadoEsperado, ResultadoObtenido);
    }


}
