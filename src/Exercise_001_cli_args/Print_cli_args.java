package Exercise_001_cli_args;

public class Print_cli_args {
    public static void main(String[] args) {
        String str = String.format("Привет - %10s! Как дела %10s?", "Саша", "на работе").replace(' ', 'X');
        System.out.println(str);
    }
}
