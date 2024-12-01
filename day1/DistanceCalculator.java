package day1;

import java.util.Collections;
import java.util.List;

public class DistanceCalculator {

    private final List<Integer> list1;
    private final List<Integer> list2;

    public DistanceCalculator(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
        sort();
    }

    public int calculateTotalDistance(){
        int totalAbs = 0;
        for (int i = 0; i < list1.size(); i++) {
            totalAbs += Math.abs(list1.get(i) - list2.get(i));
        }
        return totalAbs;
    }


    private void sort(){
        Collections.sort(list1);
        Collections.sort(list2);
    }
}
