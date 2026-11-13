public class Main {
    public static void main(String[] args) {
        String nome = (args.length > 0) ? args[0] : "visitante";
        System.out.println("Seja bem-vindo(a), " + nome + "! Projeto Git em execução.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
