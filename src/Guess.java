/*
// Игра "Угадай букву"
class Guess
{
    public static void main (String args [])
            throws java.io.IOException
    {
        char ch, ans = 'K';

        System.out.println("я задумал букву от A до Z");
        System.out.print("Угадай её: ");

        ch = (char) System.in.read(); // чтение символа с клавиатуры

        if (ch == ans) System.out.println("Правильно!");
        else
        {
            System.out.print("Неправильно! ");

            if (ch < ans) System.out.println("ниже");
            else System.out.println("выше");
        }
    }
}
*/
// с циклом do while
class Guess
{
    public static void main (String args [])
            throws java.io.IOException
    {
        char ch, ans = 'K';

        do {
        System.out.println("я задумал букву от A до Z");
        System.out.print("Угадай её: ");

        do {
            ch = (char) System.in.read(); // чтение символа с клавиатуры
        } while (ch == '\n' | ch == '\r'); // возврат каретки и перевод строки игнорируется

        if (ch == ans) System.out.println("Правильно!");
        else
        {
            System.out.print("Неправильно! ");

            if (ch < ans) System.out.println("ниже");
            else System.out.println("выше");
            System.out.println("Попробуй еще раз.");
        }
        } while (ans != ch);
    }
}
