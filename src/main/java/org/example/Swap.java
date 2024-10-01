package org.example;

public class Swap {
    void swap(int[] array, int index1, int index2) {
        if(index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length){
            return;
        }

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
