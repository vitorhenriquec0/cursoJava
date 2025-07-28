package secao8.entities;

public class Student {
    
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double calculateAverage() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public String result() {
        if (calculateAverage() >= 60.0) {
            return "PASS";
        } else {
            return "FAILED \nMISSING " + (60 - calculateAverage() + " POINTS");
        }
    }

    public String toString() {
        return "FINAL GRADE = " + calculateAverage() + "\n" + result();
    }

}
