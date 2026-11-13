public class Main {
    public static void main(String[] args) {
        String nome = (args.length > 0) ? args[0] : "mundo";
        System.out.println("Olá, " + nome + "! Bem-vindo ao projeto.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
