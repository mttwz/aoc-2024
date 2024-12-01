package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputFetcher {

    public static List<Integer> list1 = new ArrayList<>();
    public static List<Integer> list2 = new ArrayList<>();

    public static void readLines(){

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                InputFetcher.class.getClassLoader().getResourceAsStream("input.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] s = line.split("   ");
                list1.add(Integer.valueOf(s[0]));
                list2.add(Integer.valueOf(s[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
