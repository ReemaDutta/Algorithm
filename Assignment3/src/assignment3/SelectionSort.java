/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import static java.rmi.server.LogStream.log;

/**
 *
 * @author Reema
 */
public class SelectionSort {
private int[] object;
	private int index; 
  public  SelectionSort(int arraySize) {
        object = new int[arraySize];
		index = 0;
    }
  private void cSwap(int position1, int position2) {
		int tmp = object[position1];
		object[position1] = object[position2];
		object[position2] = tmp;
	}

  public  void sort() {
       int outerObj, innerObj, minObj;
 
		// Counter to print iteration
		int counter = 1;
		for (outerObj = 0; outerObj < index - 1; outerObj++) {
			minObj = outerObj;
			for (innerObj = outerObj + 1; innerObj < index; innerObj++)
				if (object[innerObj] < object[minObj]) {
 
					minObj = innerObj;
				}
			cSwap(outerObj, minObj); // swap an object
 
			// Let's print array after each iteration
			log("Iteration " + counter);
			counter++;
		}
    }
    
}
