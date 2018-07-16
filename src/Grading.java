class Grade {
    int point;
    public Grade(int point) {
        this.point = point;
    }
    public void grade2() {
        if (point < 20) {
            System.out.println("F");
        } else if (point < 40) {
            System.out.println("D");
        } else if (point < 60) {
            System.out.println("C");
        } else if (point < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
public class Grading {
    public static void main (String[] args) {
        Grade grade = new Grade(81);
        grade.grade2();
    }
}
