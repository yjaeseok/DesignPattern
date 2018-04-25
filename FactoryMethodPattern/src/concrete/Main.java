package concrete;

import framework.Item;
import framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator hpCreator = new HpCreator();
        Item hpPotion = hpCreator.create();
        hpPotion.use();

        ItemCreator mpCreator = new MpCreator();
        Item mpPotion = mpCreator.create();
        mpPotion.use();
    }
}
