package com.edu.vo;

import com.edu.util.MyDate;

public class Engineer extends Employee {
    /*
    * 1. private 필드 선언
    * 2. 값이 주입되는 통로
    *   public 명시적 생성자
    *   public setter()
    * 3. 주입된 값을 반환하는 기능을 정의
    *
    * name, birthdate, salary, mainSkill, bonus --> 5개
     */
    private String mainSkill;
    private double bonus;

    public Engineer() {
        super();
    }

    public Engineer(String name, MyDate birthdate, double salary, String mainSkill, double bonus) {
        super(name, birthdate, salary);
        this.mainSkill = mainSkill;
        this.bonus = bonus;
    }
    public String getMainSkill() {
        return mainSkill;
    }

    public void changeMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }

    public double getBonus() {
        return bonus;
    }

    public void changeBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDetails() {
        return super.getDetails() + this.mainSkill + this.bonus;
    }
}
