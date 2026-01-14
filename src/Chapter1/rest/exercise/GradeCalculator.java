package rest.exercise;

public class GradeCalculator {
    public static void main(String[] args) {
        int score1 = 70;
        int score2 = 50;
        int score3 = 100;

        int attandence = 10;
        int classes = 10;
        System.out.println("Attendance: " + attandence);
        System.out.println("Classes: " + classes);

        int average = (score1 + score2 + score3) / 3;
        System.out.println("Average score: " + average);

        if (attandence == classes && average <= 100 ) {
            average+= 10;
            System.out.println("Perfect Attendance Rewarded: " + average);
        }

        String grade = "";

        switch (average/10) {
            case 10,9 -> grade = "A";
            case 8 -> grade = "B";
            case 7 -> grade = "C";
            case 6 -> grade = "D";
            case 5,4,3,2,1,0 -> grade = "F";
        }

        boolean passed = average >= 6 ? true : false;
        if (passed) {
            System.out.println("Exam passed with " + grade);
        } else {
            System.out.println("Exam failed with " + grade);
        }
    }
}
