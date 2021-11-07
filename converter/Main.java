package converter;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            log.info("Don't setup logger config: " + e.toString());
        }
        log.info("программа запущена");
        Scanner input = new Scanner(System.in);
        log.info("выбор перевода");
        System.out.println("Чтобы перевести мили в км напишите +, км в мили -");
        String request = input.nextLine();
        double mile;
        double km;
        switch (request) {
            case "+":
                log.info("запрос миль для перевода");
                System.out.println("Введите количество миль для перевода: ");
                mile = input.nextDouble();
                km = mile * 1.609;
                System.out.printf("%f миль равно %f км ", mile, km);
                log.info("Вывод результата");
                break;
            case "-":
                log.info("запрос км для перевода");
                System.out.println("Введите количество км для перевода: ");
                km = input.nextDouble();
                mile = km / 1.609;
                System.out.printf("%f км равно %f миль ", km, mile);
                log.info("Вывод результата");
                break;
        }
            log.info("Выполнение программы завершено");
    }
}