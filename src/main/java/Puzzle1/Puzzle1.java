package Puzzle1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Puzzle1 {
    public int part1() {
        List<Integer> lines = new ArrayList<Integer>();
        int sum = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("src/test/resources/input.txt"));
            while(scanner.hasNextInt())
            {
                lines.add(scanner.nextInt());
            }
            for (Integer i : lines) {
                sum += (i / 3 - 2);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sum;
    }
    public int part2() {
        List<Integer> lines = new ArrayList<Integer>();
        int sum = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("src/test/resources/input.txt"));
            while(scanner.hasNextInt())
            {
                lines.add(scanner.nextInt());
            }
            for (Integer i : lines) {
                while (i>0) {
                    i = (i / 3 - 2);
                    if (i > 0) {
                        sum += i;
                    }
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sum;
    }
    public int count(int num) {
        return num/3-2;
    }
    public int count2(int num2) {
        int summe = 0;
        while (num2 > 0) {
            num2 = count(num2);
            if (num2 > 0) {
                summe += num2;
            }
        }
        return summe;
    }
    public static void main(String[] args) {
        Puzzle1 puzzle1 = new Puzzle1();
        puzzle1.part1();
        puzzle1.part2();
    }
}
