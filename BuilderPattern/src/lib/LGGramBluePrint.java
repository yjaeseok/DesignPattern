package lib;

public class LGGramBluePrint extends BluePrint {

    private Computer computer;

    public LGGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("I7");
    }

    @Override
    public void setRam() {
        computer.setRam("8G");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256G SSD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
