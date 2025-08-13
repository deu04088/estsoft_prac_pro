package prac_ch6_3;

class Student {
    private String name;
    private int grade;

    void setName(String name) {
        this.name = name;
    }
    void setGrade(int grade) {
        if(grade < 0) this.grade = 1;
        else this.grade = grade;
    }
    String getName() {
        return this.name;
    }
    int getGrade() {
        return this.grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("홍길동");
        student.setGrade(3);

        System.out.println("이름: " + student.getName());
        System.out.println("학년: " + student.getGrade());
        System.out.println();

        Student student2 = new Student();

        student2.setName("정동형");
        student2.setGrade(-30); // 학년이 마이너스면 1로 초기화

        System.out.println("이름: " + student2.getName());
        System.out.println("학년: " + student2.getGrade());
    }
}
//just tets