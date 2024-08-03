import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Логирование состояний и ошибок в работе программы.
 *  Напишите метод, который выбрасывает проверяемое исключение и поймайте его в методе main
 *  Отловите и залогируйте начало вызова метода с ошибкой и саму ошибку уровнем INFO и WARNING соответственно
 */


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            logger.info("Вызов метода");
            methodThatThrowsException();
        } catch (CustomCheckedException e) {
            logger.warning("Произошла ошибка: " + e.getMessage());
        }
    }

   public static void methodThatThrowsException() throws CustomCheckedException {
      throw new CustomCheckedException("Это проверяемое исключение.");
    }
}


