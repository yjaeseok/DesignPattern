public class Main {
    public static void main(String[] args) {
        // 인터페이스
        // 기능에 대한 선언과 구현을 분리
        AInterface aInterface = new AInterfaceImpl();
        aInterface.funcA();

        // 특정 객체의 기능을 위임
        AObject aObject = new AObject(aInterface);
        aObject.funcAA();
    }
}
