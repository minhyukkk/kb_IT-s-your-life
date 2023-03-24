package com.edu.test;


import com.edu.util.MyDate;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;
import com.edu.vo.Secratary;

/*
* Employee타입의 배열을 생성
* 이 안에 여러명의 Manager, Engineer, Secratary 객체를 넣고
* 부모타입으로 단일하게 이기종간의 객체들을 핸들링할 수 있는 코드를 작성
*
* Heterogeneous Collection(상속덕분)
 */
public class EmployeeAppTest3 {
    public static void main(String[] args) {
        Employee[] emps = {
                new Manager("James", new MyDate(1990, 3, 24), 20000.0, "IT"),
                new Engineer("Gosling", new MyDate(1990, 3, 24), 1500.0, "Python", 10000.0),
                new Secratary("Peter", new MyDate(1990, 3, 24), 45002.0, "LEE"),
                new Manager("James1", new MyDate(1990, 3, 24), 200002.0, "IT")
        };

        System.out.println("==================정보 출력합니다.=================");
        for (Employee e : emps) System.out.println(e.getDetails());

        System.out.println("==================연봉을 출력합니다.=================");
        for (Employee e : emps) {
            if(e instanceof Engineer) { // Employee타입으로 생성된 객체가 Engineer라면?
                Engineer eg = (Engineer)e;
                System.out.println(e.getName()+" 님의 연봉은 " + (e.getSalary() *12 + eg.getBonus()) + "달러 입니다");
            }
            else {
                System.out.println(e.getName()+" 님의 연봉은 " + e.getSalary() *12 + "달러 입니다");
            }
        }

        System.out.println("==================이름을 출력합니다.=================");
        for (Employee e : emps) System.out.println("Employee Name : " + e.getName());
    }
}