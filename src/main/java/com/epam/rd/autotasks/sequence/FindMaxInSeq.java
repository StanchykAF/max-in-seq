package com.epam.rd.autotasks.sequence;
import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> sequence = new ArrayList<>();
        int i = 0;
        do {
            sequence.add(scan.nextInt());
            i++;
        } while (sequence.get(i - 1) != 0);
        int max = sequence.get(0);
        for (int j = 0; j < sequence.size() - 1; j++) {
            if (sequence.get(j) > max) {
                max = sequence.get(j);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
