import java.util.Scanner;

public class J1259 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        Score[] score = new Score[200];
        double english = cn.nextDouble();
        double politices = cn.nextDouble();
        double math = cn.nextDouble();
        double domain = cn.nextDouble();
        double total = cn.nextDouble();
        int i = 0;
        while (cn.hasNext()) {
            String name = cn.next();
            double eng = cn.nextDouble();
            double po = cn.nextDouble();
            double ma = cn.nextDouble();
            double dm = cn.nextDouble();
            double second = cn.nextDouble();
            score[i] = new Score(name, eng, po, ma, dm, second);
            i++;
        }
        Score1[] score1 = new Score1[100];
        int z = 0;
        for (int j = 0; j < i; j++) {
            if (score[j].getEnglish() >= english && score[j].getPolitices() > politices && score[j].getMath()
                    >= math && score[j].getDomain() >= domain) {
                double sum = score[j].getEnglish() + score[j].getPolitices() + score[j].getMath() + score[j].getDomain();
                if (sum >= total) {
                    double summ = sum * 0.6 + score[j].getSecondScore() * 0.4;
                    score1[z] = new Score1(score[j].getName(), sum, score[j].getSecondScore(), summ);
                    z++;
                }
            }
        }
        for (int k = 0; k < z; k++) {
            for (int l = k + 1; l < z; l++) {
                if (score1[k].getTotalScore() < score1[l].getTotalScore()) {
                    Score1 tt = score1[k];
                    score1[k] = score1[l];
                    score1[l] = tt;
                } else if (score1[k].getTotalScore() == score1[l].getTotalScore()) {
                    if (score1[k].getName().compareTo(score1[l].getName()) > 0) {
                        Score1 tt = score1[k];
                        score1[k] = score1[l];
                        score1[l] = tt;
                    }
                }
            }
        }
        for (int m = 0; m < z; m++) {
            System.out.print(score1[m].getName() + " " + (int) score1[m].getTotal() + " " +
                    (int) score1[m].getSecondScore() + " ");
            System.out.printf("%.1f %d\n", score1[m].getTotalScore(), m + 1);
        }
    }
}

class Score1 {
    private String name;
    private double total;
    private double secondScore;
    private double totalScore;

    public Score1(String name, double total, double secondScore,
                  double totalScore) {
        super();
        this.name = name;
        this.total = total;
        this.secondScore = secondScore;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(double secondScore) {
        this.secondScore = secondScore;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }


}

class Score {
    private String name;
    private double english;
    private double politices;
    private double math;
    private double domain;
    private double secondScore;

    public Score(String name, double english, double politices, double math,
                 double domain, double secondScore) {
        super();
        this.name = name;
        this.english = english;
        this.politices = politices;
        this.math = math;
        this.domain = domain;
        this.secondScore = secondScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getPolitices() {
        return politices;
    }

    public void setPolitices(double politices) {
        this.politices = politices;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getDomain() {
        return domain;
    }

    public void setDomain(double domain) {
        this.domain = domain;
    }

    public double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(double secondScore) {
        this.secondScore = secondScore;
    }

}