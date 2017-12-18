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
