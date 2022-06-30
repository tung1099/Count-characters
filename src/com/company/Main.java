package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Nhập chuỗi: ");
        string = scanner.nextLine();
        System.out.println("Nhập ký tự: ");
        char characters;
        characters = scanner.next().charAt(0);
        int answer = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == characters){
                answer ++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + characters + " trong chuỗi là: " + answer);
    }
}
