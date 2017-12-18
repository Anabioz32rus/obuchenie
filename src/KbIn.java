//
class KbIn {
    public static void main (String args []) throws java.io.IOException
    {
        char ch;

        System.out.print("Введите символ на латинице и нажмите Enter: ");
        ch = (char) System.in.read ();

        System.out.println("Вы ввели: " +ch);
    }
}
