package class1;

public class ClassStart1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        Student[] students = new Student[2];
        students[0]= student1;//객체 student1의 참조값을 할당함
        students[1]= student2;//객체 student1의 참조값을 할당함
        for (Student s : students) {

            System.out.println(student1);
            System.out.println("====");
            System.out.println(student2);

        }
    }
}
