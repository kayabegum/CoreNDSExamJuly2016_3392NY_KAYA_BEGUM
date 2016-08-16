package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kayabegum on 8/14/2016.
 */
    public class Anagram {

        public static void main(String[] args) {
            //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
            //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two words: ");
            String st1 = scanner.next();
            String st2 = scanner.next();

            char[] c1 = st1.toCharArray();
            char[] c2 = st2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)){
                System.out.println("The words are Anagram");
            }
            else
                System.out.println("The Words are not Anagram");
        }

}




