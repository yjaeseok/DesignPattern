import lib.Age;
import lib.Cat;
import lib.Circle;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1, 1, 3);
        Circle circle2 = circle1.copy();
        System.out.println(circle1.getX() + ", " + circle1.getY() + ", " + circle1.getRadius());
        System.out.println(circle2.getX() + ", " + circle2.getY() + ", " + circle2.getRadius());

        // Deep Shallow copy test
        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2013, 2));

        Cat yo = navi.copy();
        yo.setName("yo");
        yo.getAge().setYear(2012);
        yo.getAge().setValue(3);

        System.out.println(navi.getName() + ", " + navi.getAge().getYear() + ", " + navi.getAge().getValue());
        System.out.println(yo.getName() + ", " + yo.getAge().getYear() + ", " + yo.getAge().getValue());
    }
}
