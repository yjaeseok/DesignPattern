package main;

import helper.AbsGameConnectHelper;
import helper.PhoneGameConnectHelper;

/**
 * Template Method Pattern
 * <p>
 * 알고리즘을 여러 단계로 나눈다.
 * 나눠진 알고리즘의 단계를 메소드로 선언한다.
 * 알고리즘을 수행할 템플릿 메소드를 만든다.
 * 하위 클래스에서 나눠진 메소드를 구현한다.
 */

public class Main {
    public static void main(String[] args) {
        AbsGameConnectHelper gameConnectHelper = new PhoneGameConnectHelper();
        gameConnectHelper.requestConnection("test");
    }
}
