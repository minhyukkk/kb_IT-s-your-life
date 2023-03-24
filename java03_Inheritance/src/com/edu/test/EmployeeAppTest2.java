package com.edu.test;

import com.edu.util.MyDate;
import com.edu.vo.Manager;

/*
    *
    * Manager 타입의 배열을 생성
    * 이 안에 여러명의 Manager 객체를 넣고
    * 한번에 핸들링 할 수 있는 코드를 작성
    */
public class EmployeeAppTest2 {
    public static void main(String[] args) {
        Manager[] managers = {
                new Manager("James", new MyDate(1990, 3, 24), 20000.0, "IT"),
                new Manager("Gosling", new MyDate(1990, 3, 24), 150000.0, "Markting"),
                new Manager("Peter", new MyDate(1990, 3, 24), 450002.0, "IT")
        };

        System.out.println("==================정보 출력합니다.=================");
        for (Manager m : managers) System.out.println(m.getDetails());

        System.out.println("==================연봉을 출력합니다.=================");
        for (Manager m : managers) System.out.println(m.getSalary() * 12 + " 달러");

        System.out.println("==================이름을 출력합니다.=================");
        for (Manager m : managers) System.out.println("Manager Name : " + m.getName());
    }
}
