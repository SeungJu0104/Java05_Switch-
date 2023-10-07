package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	
	//Switch문
	//switch(조건문) {case 값 : 참일 경우 실행할 코드 case 값 : 참일 경우 실행할 코드 ... default: 값이 없을 경우 실행할 코드}
	//조건식의 값에 맞는 case를 해당 case부터 끝까지 코드를 실행하는 조건문이다.
	//break, continue를 이용해 코드 실행 범위를 설정
	public void testSwitch() {
		
		int num = 6;
		
		switch(num) {//()안에 조건식
			case 1://조건식의 결과 값과 case의 값과 일치하는지 확인. 일치하지 않으면 다음 case로 이동.
				System.out.println("1입니다.");//조건식의 결과 값과 case 값이 일치하면 코드 실행
				break;//switch문을 종료
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("1입니다.");
				break;
			default://모든 case와 일치하지 않을 경우
				System.out.println("아닙니다.");//모든 case의 값과 일치하지 않을 경우 코드 실행
		
		}
		
	}
	
	public void testSwitch02() {
		
		char ch = 'c';
		
		switch(ch) {
			case 'a':
				System.out.println("a!");
				break;
			case 'b':
				System.out.println("b@");
				break;
			case 'c':
				System.out.println("c#");
				break;
			default:
				System.out.println("아닙니다.");
		}
		
		String str = "영국";
		//String도 switch문 사용 가능.
		switch(str) {
			case "한국":
				System.out.println("kor");
				break;
			case "미국":
				System.out.println("usa");
				break;
			case "영국":
				System.out.println("uk");
				break;
			default:
				System.out.println("무국적자");
				break;
		
		}
		
	}
	
	public void testSwitch03() {
		
		System.out.print("월 입력: ");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		
		//case 3,4,5: //옆으로 입력하는 것은 컴파일러 문제로 인해 자바 14이상 버전부터 가능.
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
			
		default:
			System.out.println("1 - 12사이의 숫자를 입력해주세요.");
		}
		
		
	}

}
