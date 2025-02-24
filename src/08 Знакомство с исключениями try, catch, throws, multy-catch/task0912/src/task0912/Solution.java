package task0912;

/* 
Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);


Requirements:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {

            int num = Integer.parseInt("XYZ");
            System.out.println(num);

            //напишите тут ваш код
        } catch (NumberFormatException e) {
              System.err.println("Возникло исключение: " + e.getClass().getName());
            System.err.println("Сообщение: " + e.getMessage());
           // System.err.println("Возникла ошибка");
          //  e.printStackTrace();
        }
    }
    }