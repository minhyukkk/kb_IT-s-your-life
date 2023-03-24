package com.edu.vo;

import com.edu.util.MyDate;

public class Engineer {
    /*
    * 1. private 필드 선언
    * 2. 값이 주입되는 통로
    *   public 명시적 생성자
    *   public setter()
    * 3. 주입된 값을 반환하는 기능을 정의
    *
    * name, birthdate, salary, mainSkill, bonus --> 5개
     */
    private String name;
    private MyDate birthdate;
    private double salary;
    private String mainSkill;
    private int bonus;

    public Engineer(String name, MyDate birthdate, double salary, String mainSkill, int bonus) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
        this.mainSkill = mainSkill;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(MyDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getDetails() {
        return name + "," + birthdate.getDate() + "," + salary + "," + mainSkill + bonus;
    }
}
