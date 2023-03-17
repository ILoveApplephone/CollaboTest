package kr.ac.kopo.day08.homework;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {10,20,30,40,50,60};
int [] dest = new int[arr.length];

 for(int i =0; i < arr.length; i++) {
	dest[i] = arr[i];
	
 }

System.out.println("arr :" + Arrays.toString(arr));
System.out.println("dest :" + Arrays.toString(dest));

	}

}
