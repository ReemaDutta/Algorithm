/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.ArrayList;

/**
 *
 * @author Reema
 */
public class BenchMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t= 50000;
  int t2 = 100000;
   int t3=200000;
   int t4=300000;
   int t5=400000;
  
  
  
   /**
   * InsertionSort
   */
   System.out.println("********************Insertion Sort ************************");
   Long b=System.currentTimeMillis();
   InsertionSort i1=new InsertionSort(t);
   i1.sort();
   Long a=System.currentTimeMillis();
   System.out.println("Insertion sort takes "+(a-b)+ " ms"+ " for " +t);
  Long b2=System.currentTimeMillis();
   InsertionSort i2=new InsertionSort(t);
   i2.sort();
  Long a2=System.currentTimeMillis();
   System.out.println("Insertion sort takes "+(a2-b2)+" ms"+ " for " +"above sorted array");
Long b3=System.currentTimeMillis();
   InsertionSort i3=new InsertionSort(t2);
   i3.sort();
   Long a3=System.currentTimeMillis();
   System.out.println("Insertion sort takes "+(a3-b3)+" ms"+ " for "+ t3);
  Long b4=System.currentTimeMillis();
   InsertionSort i4=new InsertionSort(t4);
   i4.sort();
  Long a4=System.currentTimeMillis();
   System.out.println("Insertion sort takes "+(a4-b4)+" ms" + " for "+ t4);
  Long b5=System.currentTimeMillis();
   InsertionSort i5=new InsertionSort(t5);
   i5.sort();
  Long a5=System.currentTimeMillis();
   System.out.println("Insertion sort takes "+(a5-b5)+" ms" + " for "+ t5);
  
   
   /**
   * SELECTION SORT
   */
  
   System.out.println("********************Selection Sort****************");
   b=System.currentTimeMillis();
   SelectionSort s1=new SelectionSort(t);
   s1.sort();
   a=System.currentTimeMillis();
   System.out.println("Selection sort takes "+(a-b)+" ms"+ " for " +t);
   b2=System.currentTimeMillis();
   SelectionSort s2=new SelectionSort(t);
   s2.sort();
   a2=System.currentTimeMillis();
   System.out.println("Selection sort takes "+(a2-b2)+ "ms"+ " for " +"above sorted array");
   b3=System.currentTimeMillis();
   SelectionSort s3=new SelectionSort(t3);
   s3.sort();
   a3=System.currentTimeMillis();
   System.out.println("Selection sort takes "+(a3-b3)+" ms"+ " for "+ t3);
   b4=System.currentTimeMillis();
   SelectionSort s4=new SelectionSort(t4);
   s4.sort();
   a4=System.currentTimeMillis();
   System.out.println("Selection sort takes "+(a4-b4)+" ms" + " for "+ t4);
   b5=System.currentTimeMillis();
   SelectionSort s5=new SelectionSort(t5);
   s5.sort();
   a5=System.currentTimeMillis();
   System.out.println("Selection sort takes "+(a5-b5)+" ms" + " for "+ t5);
  
   
    }
    
}
