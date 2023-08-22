import java.util.Scanner;
import java.util.ArrayList;

class Subject {
    int numofsubs;
    ArrayList<Integer> subs = new ArrayList<Integer>();

    public void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        numofsubs = sc.nextInt();

        int marksobtained = 0;
        for (int i = 0; i < numofsubs; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + ":");
            int marks = sc.nextInt();
            subs.add(marks);
            marksobtained += marks;
        }
        sc.close();

        System.out.println("Total marks obtained: " + marksobtained);
    }
}

class Grade {
    public void gradecalc(int totalmarks, int numsub) {
        double avgpercent = ((double) totalmarks) / numsub;
        System.out.println("Average percentage obtained is " + avgpercent + "%.");

        if (avgpercent >= 85) {
            System.out.println("GRADE A");
        } else if (avgpercent >= 70) {
            System.out.println("GRADE B");
        } else if (avgpercent >= 55) {
            System.out.println("GRADE C");
        } else if (avgpercent >= 40) {
            System.out.println("GRADE D");
        } else {
            System.out.println("GRADE E");
        }
    }
}

public class studgradecaltask2 {
    public static void main(String[] args) {
        Subject s = new Subject();
        s.sub();

        int totalmarks = s.subs.stream().mapToInt(Integer::intValue).sum();
        Grade g = new Grade();
        g.gradecalc(totalmarks, s.numofsubs);
    }
}
