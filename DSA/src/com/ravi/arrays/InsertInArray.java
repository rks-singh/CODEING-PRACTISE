package com.ravi.arrays;

public class InsertInArray {
    private final int[] arr;
    public InsertInArray(int[] arr) {
        this.arr = arr;
    }

    public void display() {
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public int insertInArray(int[] arr, int pos, int cap, int size, int x) {
        if (cap == size) {
            return size;
        }
        int index = pos-1;
        for (int i = cap - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index]=x;
        return (cap+1);
    } // Time Complexity ==> O(n) overall
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=2;
        arr[1]=3;
        arr[2]=5;

        int cap = 3;
        int size = arr.length;

        InsertInArray insertInArray = new InsertInArray(arr);
        insertInArray.display();
        cap = insertInArray.insertInArray(arr,5,cap,size,4);
        insertInArray.display();
    }
}
