package oop.ex;

import java.util.Scanner;

public class Rectangle {
    //멤버 변수, 필드
    int width;
    int height;

    //사실은 메서드가 아니라 생성자에서 값을 입력받으면 더 좋을 듯...?
    void inputValue() {
        Scanner scan = new Scanner(System.in);
        System.out.print("사각형 너비를 알려주세요: ");
        width = Integer.parseInt(scan.nextLine());

        System.out.print("사각형 높이를 알려주세요: ");
        height = Integer.parseInt(scan.nextLine());


        System.out.println("Rectangle 정보 입력 완료.");
        System.out.println("======================");

    }

    void calculateArea() {
        int area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter() {
        int perimeter = 2 * (width * height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare() {
        boolean isSquare = (width == height);
        System.out.println("정사각형 여부:"+isSquare);
    }

}
