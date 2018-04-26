import lib.Computer;
import lib.ComputerBuilder;
import lib.ComputerFactory;
import lib.LGGramBluePrint;

public class Main {

    // 빌더패턴
    // 복잡한 단계가 있는 인스턴스 생성을 단순화
    public static void main(String[] args) {

        // Builder Pattern 1
        ComputerFactory factory = new ComputerFactory();

        // 설계도를 가지고
        factory.setBluePrint(new LGGramBluePrint());
        // 설계도로 만들고
        factory.make();
        // 만든 것을 리턴
        Computer computer = factory.getComputer();

        System.out.println(computer);


        // Builder Pattern2
        Computer computer2 = ComputerBuilder
                .start()
                .setCpu("I8")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer2);
    }
}
