//
//  main.c
//  b
//
//  Created by xiaoming Zhou on 12/4/16.
//  Copyright © 2016 xiaoming Zhou. All rights reserved.
//

/*
 * BubbleSort.c
 *
 *  Created on: Dec 4, 2016
 *      Author: Mark
 */


#include <stdio.h>
#include <time.h>
void read_ints (const char* file_name, int array[])
{
    FILE* file = fopen (file_name, "r");
    int i = 0;
    int n=0;
    while (!feof (file))
    {
        fscanf (file, "%d", &n);
        array[i] = n;
        i++;
    }
    fclose (file);
}
void bubble (int array[], int n)
{
    int c, d, swap;
    for (c = 0 ; c < ( n - 1 ); c++)
    {
        for (d = 0 ; d < n - c - 1; d++)
        {
            if (array[d] > array[d+1]) /* For decreasing order use < */
            {
                swap       = array[d];
                array[d]   = array[d+1];
                array[d+1] = swap;
            }
        }
    }
}
int main()
{
    int array[100000], n ;
    n = 10;
    float diff;
    clock_t start, end, esttime;
    
    read_ints("/Users/Mark/Documents/input/input1.txt", array);
    start = clock();
    bubble(array, 10);
    end = clock();
    esttime = end - start;
    diff = ((float)(end - start) / 1000000.0F ) * 1000;
    printf ( "Input 1 : %f\n", diff );
    
    read_ints("/Users/Mark/Documents/input/input2.txt", array);
    start = clock();
    bubble(array, 100);
    end = clock();
    esttime = end - start;
    diff = ((float)(end - start) / 1000000.0F ) * 1000;
    printf ( "Input 2 : %f\n", diff );
    
    read_ints("/Users/Mark/Documents/input/input3.txt", array);
    start = clock();
    bubble(array, 1000);
    end = clock();
    esttime = end - start;
    diff = ((float)(end - start) / 1000000.0F ) * 1000;
    printf ( "Input 3 : %f\n", diff );
    
    read_ints("/Users/Mark/Documents/input/input4.txt", array);
    start = clock();
    bubble(array, 10000);
    end = clock();
    esttime = end - start;
    diff = ((float)(end - start) / 1000000.0F ) * 1000;
    printf ( "Input 4 : %f\n", diff );
    
    read_ints("/Users/Mark/Documents/input/input5.txt", array);
    start = clock();
    bubble(array, 100000);
    end = clock();
    esttime = end - start;
    diff = ((float)(end - start) / 1000000.0F ) * 1000;
    printf ( "Input 5 : %f\n", diff );
    
    return 0;
}



