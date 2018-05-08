package framework;

public abstract class ItemCreator {

    public Item create() {
        requestItemsInfo();
        Item item = createItem();
        createItemLog();
        return item;
    }

    abstract protected void requestItemsInfo();

    abstract protected void createItemLog();

    abstract protected Item createItem();
}
