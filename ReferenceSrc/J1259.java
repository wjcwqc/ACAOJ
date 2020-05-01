import java.util.*;

public class J1259 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        double[] score = new double[5];
        for (int i = 0; i < score.length; i++) {
            score[i] = cin.nextDouble();
        }
        while (cin.hasNext()) {
            String name = cin.next();
            double english = cin.nextDouble();
            double politics = cin.nextDouble();
            double math = cin.nextDouble();
            double major = cin.nextDouble();
            double scores = cin.nextDouble();
            Student stu = new Student(name, english, politics, math, major, scores);
            list.add(stu);
        }
        list.sort((o1, o2) -> {
            double x = o1.english + o1.politics + o1.math + o1.major;
            double y = o2.english + o2.politics + o2.math + o2.major;
            double s1 = x * 0.6 + o1.scores * 0.4;
            double s2 = y * 0.6 + o2.scores * 0.4;
            double s = Double.compare(s1, s2);
            if ((int) s != 0) {
                return (int) -s;
            } else {
                return -o1.name.compareTo(o2.name);
            }
        });
        int i = 0;
        for (Student s1 : list) {
            int sum = (int) (s1.english + s1.politics + s1.major + s1.math);
            if (s1.english < score[0] || s1.politics < score[1] || s1.math < score[2]
                    || s1.major < score[3] || s1.scores < 60 || sum < score[4]) break;
            double s = sum * 0.6 + s1.scores * 0.4;
            String bd = String.format("%.1f", s);
            s = Double.parseDouble(bd);
            System.out.println(s1.name + " " + sum + " "
                    + (int) s1.scores + " " + s + " " + (++i));
        }
    }

    private static class Student {
        String name;
        double english;
        double politics;
        double math;
        double major;
        double scores;

        Student(String name, double english, double politics, double math, double major, double scores) {
            this.name = name;
            this.english = english;
            this.politics = politics;
            this.math = math;
            this.major = major;
            this.scores = scores;
        }
    }

}