package com.edu.exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
    public void readFile(String fileName){
        try {
            FileReader reader = new FileReader(fileName); // CompileException
            System.out.println("1. 파일을 잘 찾았습니다.");
        }catch (FileNotFoundException e) {
            System.out.println("1. 파일을 찾을 수 없습니다.");
        }
        System.out.println("2. FileReader API Creating...");
    }
}
public class CompileExceptionTest2 {
    public static void main(String[] args) {
        FileReading fr = new FileReading();
        fr.readFile("C:\\Users\\minhyuk\\Desktop\\민혁\\취업하자\\KB\\workshop\\java_01\\java_r1_Workshop.pdf");

        System.out.println("파일을 잘 읽어들였습니다.");
    }
}
