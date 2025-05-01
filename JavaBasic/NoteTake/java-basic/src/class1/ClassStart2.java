package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames;
        studentNames = new String[]{"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int studentGrade : studentGrades) {
            System.out.println( "성적:" + studentGrade);
        }
    }
}
