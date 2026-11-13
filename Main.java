public class Main {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "World";
        System.out.printf("Hello %s and welcome!%n", name);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
