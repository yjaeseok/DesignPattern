package pre;

public class AObject {
    private AInterface aInterface;

    public AObject(AInterface aInterface) {
        this.aInterface = aInterface;
    }

    // 위임한다.
    public void funcAA() {
        aInterface.funcA();
        aInterface.funcA();
    }

}
