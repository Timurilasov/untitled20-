package task1004;

/* 
Задача №4 на преобразование целых типов
Добавь одну операцию по преобразованию типа, чтобы на экран вывелось 9.
short number = 9;
char zero = '0';
int nine = (zero + number);


Requirements:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран. В ней можно только добавлять операторы приведения типа.
3. Метод main() должен содержать переменную number типа short.
4. Метод main() должен содержать переменную zero типа char.
5. Метод main() должен содержать переменную nine типа int.
6. Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
7. Программа должна выводить число 9.*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (int)(zero -'0'+ number);
        System.out.println(nine);
    }
}
