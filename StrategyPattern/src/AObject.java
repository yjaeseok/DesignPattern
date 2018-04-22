public class AObject {
    private AInterface aInterface;

    public void funcAA() {
        aInterface.funcA();
        aInterface.funcA();
    }

    AObject(AInterface aInterface) {
        this.aInterface = aInterface;
    }
}
