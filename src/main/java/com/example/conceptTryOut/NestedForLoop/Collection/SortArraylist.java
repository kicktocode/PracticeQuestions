package com.example.conceptTryOut.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArraylist {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(94);
        integers.add(82);
        integers.add(404);
        integers.add(48);
        Collections.sort(integers);
        System.out.println(integers);



    }
}
