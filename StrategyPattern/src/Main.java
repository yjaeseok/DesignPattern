import example.Axe;
import example.GameCharacter;
import example.Knife;
import example.Sword;
import pre.AInterface;
import pre.AInterfaceImpl;
import pre.AObject;


/**
 * StrategyPattern (https://www.youtube.com/watch?v=UEjsbd3IZvA&list=PLsoscMhnRc7pPsRHmgN4M8tqUdWZzkpxY)
 * 인터페이스 개념을 이해한다.
 * 델리게이트 개념을 이해한다.
 * 전략 패턴 개념을 이해한다.
 */
public class Main {
    public static void main(String[] args) {
        // 인터페이스
        // 기능에 대한 선언과 구현을 분리
        AInterface aInterface = new AInterfaceImpl();
        aInterface.funcA();

        // 특정 객체의 기능을 위임
        AObject aObject = new AObject(aInterface);
        aObject.funcAA();

        // Example
        GameCharacter character = new GameCharacter();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }
}
