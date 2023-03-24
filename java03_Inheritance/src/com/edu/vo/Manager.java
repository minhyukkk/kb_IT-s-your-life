package com.edu.vo;

import com.edu.util.MyDate;

/*
* Manager 에 대한 정보를 저장하는 클래스
* 1. private 필드 선언
* 2. public 값이 주입되는 통로(생성자, setter())
* 3. public 주입된 값을 반환하는 기능
 */
public class Manager extends Employee{
    private String dept;

    public Manager(String name, MyDate birthday, double salary, String dept) {
        // 무조건 부모 생성이 일어나야함
        super(name, birthday, salary);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void changeDept(String dept) {
        this.dept = dept;
    }
}
