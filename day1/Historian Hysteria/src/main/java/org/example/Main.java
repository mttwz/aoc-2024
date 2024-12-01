package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        InputFetcher.readLines();
        DistanceCalculator distanceCalculator = new DistanceCalculator(InputFetcher.list1, InputFetcher.list2);
        int i = distanceCalculator.calculateTotalDistance();
        System.out.println(i);
    }
}
