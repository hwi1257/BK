package Class;

class Student1{

    String name;
    String studentNumber;
    double KoreanScore;
    double englishScore;
    double mathScore;



    double calculateAverage(){
        return   (KoreanScore+englishScore+mathScore)/3.0;

    }
    void printStudentInfo(){
        System.out.println("학생 이름:"+name);
        System.out.println("학번:"+studentNumber);
        System.out.println("국어 성적:"+KoreanScore);
        System.out.println("영어 성적:"+englishScore);
        System.out.println("수학 성적:"+mathScore);
        System.out.println("평균 성적:"+calculateAverage());
    }


}

public class Sc {
    public static void main(String[] args) {
        Student1 sc = new Student1();

        sc.name = "이종휘";
        sc.studentNumber = "23-76039775";
        sc.KoreanScore = 90;
        sc.englishScore = 100;
        sc.mathScore = 100;

        sc.calculateAverage();
        sc.printStudentInfo();
    }
}
