package com.itvdn.javaEssential.ex_005_arrays.array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // оголошення списку
        ArrayList<String> arrayList = new ArrayList<>();

        // додавання елементів до списку
        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("would you?");

        System.out.println(arrayList);

        // додавання по індексу
        arrayList.add(0, "teacher");

        // видалення елементів за індексом
        arrayList.remove(1);

        // видалення елементів за значенням
        arrayList.remove("would you?");

        System.out.println(arrayList);
    }
}
