package cond.ex;

import java.util.Arrays;
import java.util.Scanner;

public class MovieRateEx {//영화 평점 프로그램
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("영화의 평점을 추천해주세요 : ");
        double movieRate = scan.nextDouble();

        if (movieRate>=9) {
            System.out.println("rating: "+movieRate);
            System.out.println("출력 : 어바웃타임을 추천합니다.");
        }
        else if(movieRate>7){
            System.out.println("rating: "+movieRate);
            System.out.println("출력 : 어바웃타임을 추천합니다.");
            System.out.println("출력 : 토이스토리를 추천합니다.");
        }else {
            System.out.println("rating: "+movieRate);
            System.out.println("출력 : 어바웃타임을 추천합니다.");
            System.out.println("출력 : 토이스토리를 추천합니다.");
            System.out.println("출력 : 고질라를 추천합니다.");
        }


    }
}
