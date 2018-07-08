/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import static com.sun.activation.registries.LogSupport.log;
import java.util.ArrayList;

/**
 *
 * @author Reema
 */
public class InsertionSort {
private static int[] cObject;
	private static int cIndex; // Default index is 0
    InsertionSort(int arraySize) {
  cObject = new int[arraySize];
		cIndex = 0;
    }

   public void sort() {
       int tmpObj, obj1, obj2;
 
		// Counter to print iteration
		int counter = 1;
 
		for (obj2 = 1; obj2 < cObject.length; obj2++) {
			obj1 = obj2 - 1;
			tmpObj = cObject[obj2];
			while ((obj1 >= 0) && (tmpObj < cObject[obj1])) {
				cObject[obj1 + 1] = cObject[obj1];
				obj1--;
			}
			cObject[obj1 + 1] = tmpObj;
			// Let's print array after each iteration
			log("Iteration " + counter);
			counter++;
    }
    
}
}
