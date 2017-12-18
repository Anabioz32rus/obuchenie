//  пример работы с char
class chardemo {
    public static void main (String args []) {
        char ch;

        ch = 'л';
        System.out.println("ch содержит " + ch);

        // к переменной типа char применяем инкриминирования
        ch ++;
        System.out.println("ch содержит " + ch);

        // к переменной char присвоим целочисленное значение
        ch = 115;
        System.out.println("ch содержит " + ch);
    }
}
