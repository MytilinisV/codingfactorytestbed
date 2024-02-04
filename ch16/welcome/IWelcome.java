package gr.aueb.cf.ch16.welcome;

public interface IWelcome {
    void saySomething(String message);

    default void sayHelloCodingFactory() {
        System.out.println("Hello ");
        sayCodingFactory();
    }

    private void sayCodingFactory() {
        System.out.println("Coding Factory");
        sayHelloCoding();
    }

    static void sayHelloCoding() {
        System.out.println("Hello ");
        sayCoding();
    }

    private static void sayCoding() {
        System.out.println("Coding");
    }
}
