package com.edu.vo;

import com.edu.util.MyDate;
// 부모 클래스, Super 클래스, Parent
public class Employee {

    private String name;
    private MyDate birthday;
    private double salary;

    // 상수값
    public static final double basic_salary = 100;

    public Employee() {
    }
    public Employee(String name, MyDate birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    /*
    * this
    * 1) local 변수와 field의 이름이 동일할 때 구분하기 위해 필드 앞에 붙인다.
    * 2) this() -> 하나의 클래스에서 또 다른 생성자를 호출할 때 사용
     */
    public Employee(String name, MyDate birthday) {
        this(name, birthday, basic_salary); // -> 이렇게 하면 null 값이 들어가지 x
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

    public void changeSalary(double salary) {
        this.salary = salary;
    }

    public String getDetails() {
        return name + "," + birthday.getDate() + "," + salary;
    }
}
