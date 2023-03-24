package com.edu.vo;

import com.edu.util.MyDate;

/*
* Manager 에 대한 정보를 저장하는 클래스
* 1. private 필드 선언
* 2. public 값이 주입되는 통로(생성자, setter())
* 3. public 주입된 값을 반환하는 기능
 */
public class Manager {
    // filed... 힙에 올라감
    private String name;
    private MyDate birthday;
    private double salary;
    private String dept;

    public Manager(){
    }
    // ~Test 클래스에서 생성자를 호출하는 시점에 값이 필드에 주입
    // 명시적 생성자
    // 값을 주입하는 통로
    public Manager(String name, MyDate birthday, double salary, String dept) {
        // 초기화 -> 새로운 값 할당
        // 필드 초기화
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.dept = dept;
    }

    // 값을 주입하는 통로
    public void setManagerFiled(String name, MyDate birthday, double salary, String dept) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.dept = dept;
    }

    public String getDetails() {
        return name + "," + birthday.getDate() + "," + salary + "," + dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
