// программа, демонстрирующая работу с логическими данными
class booldemo {
    public static void main (String args []) {
        boolean b;

        b = false; System.out.println("b = " + b);
        b = true; System.out.println("b = " + b);

        // логическое значение в качестве условия в операторе if
        if (b) System.out.println("правда");
        b = false; if (b) System.out.println("ложь"); // не выводится на экран, так как b = false

        // логические значения получаются оператором сравнения
        System.out.println("10 > 9 это " + (10 > 9));
            }
}
