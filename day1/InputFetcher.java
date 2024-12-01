package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFetcher {


    public static void readLines(){

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line here
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
