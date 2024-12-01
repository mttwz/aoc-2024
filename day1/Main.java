package day1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DistanceCalculator distanceCalculator = new DistanceCalculator(
                new ArrayList<>(List.of(3, 4, 2, 1, 3, 3)),
                new ArrayList<>(List.of(4, 3, 5, 3, 9, 3))
        );
        int i = distanceCalculator.calculateTotalDistance();
        System.out.println(i);
    }
}
