package gr.aueb.cf.ch16;

public class Dog implements ISpeakable{

    private String name;



    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        this.name = name;
    }
}
