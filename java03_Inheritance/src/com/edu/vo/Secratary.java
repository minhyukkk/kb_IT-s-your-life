package com.edu.vo;

import com.edu.util.MyDate;

/*
* Manager 에 대한 정보를 저장하는 클래스
* 1. private 필드 선언
* 2. public 값이 주입되는 통로(생성자, setter())
* 3. public 주입된 값을 반환하는 기능
 */
public class Secratary extends Employee {
    // filed... 힙에 올라감
    private String bossOfName;

    public Secratary(){
        super();
    }
    // ~Test 클래스에서 생성자를 호출하는 시점에 값이 필드에 주입
    // 명시적 생성자
    // 값을 주입하는 통로
    public Secratary(String name, MyDate birthday, double salary, String bossOfName) {
        // 초기화 -> 새로운 값 할당
        // 필드 초기화
        super(name, birthday, salary);
        this.bossOfName = bossOfName;
    }

    public String getBossOfName() {
        return bossOfName;
    }

    public void changeBossOfName(String bossOfName) {
        this.bossOfName = bossOfName;
    }

}
