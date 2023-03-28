package com.edu.exception.test2;

import java.io.FileReader;
import java.io.IOException;

class FileReading{
    // 발생한 예외를 즉각적으로 잡지 않고 던졌다... 호출한 지점으로 예외가 날라간다
    public void readFile(String fileName) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName); // CompileException
            System.out.println("1. 파일을 잘 찾았습니다.");
        } finally {
            reader.close();
        }
        System.out.println("2. FileReader API Creating...");
    }
}
public class CompileExceptionTest2 {
    public static void main(String[] args) {
        FileReading fr = new FileReading();
        try{
            fr.readFile("C:\\Users\\minhyuk\\Desktop\\민혁\\취업하자\\KB\\workshop\\java_01\\java_r1_Workshop.pdf");
        }catch (Exception e) {

        }
        System.out.println("파일을 잘 읽어들였습니다.");
    }
}
