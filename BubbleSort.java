package java1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
 
public class BubbleSort {
 
        public static void main(String[] args) {
               	int intArray1[] = new int [10];
               	int intArray2[] = new int [100];
               	int intArray3[] = new int [1000];
               	int intArray4[] = new int [10000];
               	int intArray5[] = new int [100000];
                int i = 0;
                Scanner scanner;
				File file1 = new File("/Users/Mark/Documents/input/input1.txt");
				File file2 = new File("/Users/Mark/Documents/input/input2.txt");
				File file3 = new File("/Users/Mark/Documents/input/input3.txt");
				File file4 = new File("/Users/Mark/Documents/input/input4.txt");
				File file5 = new File("/Users/Mark/Documents/input/input5.txt");
				
				try {
					scanner = new Scanner(file1);
					while(scanner.hasNextInt()){
		                   intArray1[i++] = scanner.nextInt();
		                }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					scanner = new Scanner(file1);
					while(scanner.hasNextInt()){
		                   intArray2[i++] = scanner.nextInt();
		                }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					scanner = new Scanner(file1);
					while(scanner.hasNextInt()){
		                   intArray3[i++] = scanner.nextInt();
		                }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					scanner = new Scanner(file1);
					while(scanner.hasNextInt()){
		                   intArray4[i++] = scanner.nextInt();
		                }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					scanner = new Scanner(file1);
					while(scanner.hasNextInt()){
		                   intArray5[i++] = scanner.nextInt();
		                }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                long startTime = System.nanoTime();    
                bubbleSort(intArray1);
                long estimatedTime = System.nanoTime() - startTime;
                System.out.println(estimatedTime);
                
                startTime = System.nanoTime();    
                bubbleSort(intArray2);
                estimatedTime = System.nanoTime() - startTime;
                System.out.println(estimatedTime);
                
                startTime = System.nanoTime();    
                bubbleSort(intArray3);
                estimatedTime = System.nanoTime() - startTime;
                System.out.println(estimatedTime);
                
                startTime = System.nanoTime();    
                bubbleSort(intArray4);
                estimatedTime = System.nanoTime() - startTime;
                System.out.println(estimatedTime);
                
                startTime = System.nanoTime();    
                bubbleSort(intArray5);
                estimatedTime = System.nanoTime() - startTime;
                System.out.println(estimatedTime);
        }
        private static void bubbleSort(int[] intArray) {
               int n = intArray.length;
                int temp = 0;
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                                if(intArray[j-1] > intArray[j]){
                                        //swap the elements!
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[j];
                                        intArray[j] = temp;
                                }
                        }
                }       
        }
}
