package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(7);

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int updateValue = scanner.nextInt();
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
        arrayList.remove(index);
        arrayList.add(index, updateValue);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
