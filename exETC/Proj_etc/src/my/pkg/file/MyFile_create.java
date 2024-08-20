package my.pkg.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile_create {

	public static void main(String[] args) {

//		myfile.txt 새파일생성
		try {
			File file = new File("myfile.txt");
			if (file.createNewFile())
				System.out.println("새로 만든 파일: " + file.getName());
			else
				System.out.println("파일이 이미 존재합니다.");

		} catch (IOException e) {
			System.out.println("---파일 생성 오류---");
			e.printStackTrace();
		}
		System.out.println();

//		myfile.txt 파일 내용 작성
		try {
			FileWriter writer = new FileWriter("myfile.txt");
			writer.write("^^파일 작성하기 테스트^^");
			writer.close();
			System.out.println("---파일 쓰기 성공---");
		} catch (IOException e) {
			System.out.println("---파일 쓰기중 오류---");
			e.printStackTrace();
		}
		System.out.println();

//		myfile.txt 파일 읽기
		try {
			File file = new File("myfile.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String dat = reader.nextLine();
				System.out.println("파일내용은: \n" + dat);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("---파일을 찾지 못했습니다---");
			e.printStackTrace();
		}
		System.out.println();

//		myfile.txt 파일정보출력
		File file = new File("myfile.txt");
		if (file.exists()) {
			System.out.println("파일명: " + file.getName());
			System.out.println("파일경로: " + file.getAbsolutePath());
			System.out.println("파일쓰기모드: " + file.canWrite());
			System.out.println("파일읽기모드: " + file.canRead());
			System.out.println("파일용량: " + file.length());
		}else
			System.out.println("파일이 존재하지 않습니다.");
		System.out.println();
		
//		myfile.txt 파일 삭제
//		if(file.delete()) 
//			System.out.println("파일삭제: " + file.getName());
//		else
//			System.out.println("---삭제 실패---");

	}

}
