// Справочник по циклам в Java
class Help2 {
    public static void main (String args []) throws java.io.IOException {
        char ch;

        // do {
        for (ch = '0'; ch != '6';) {
            System.out.println("Помощь по:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. Выход");
            System.out.print("\nВыбери: ");
            do {
                ch = (char) System.in.read();
            } while (ch == '\n' | ch == '\r');

        // }while (ch < '1' | ch > '5' );

        System.out.println("\n");

        switch (ch) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if (выражение) последовательность выражений;");
                System.out.println("else последовательность выражений;");
                break;

            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (выражение) {");
                System.out.println("\tcase константа:");
                System.out.println("\tпоследовательность выражений;");
                System.out.println("\tbreak;");
                System.out.println("\t//...");
                System.out.println("default: последовательность выражений;");
                System.out.println("}");
                break;

            case '3':
                System.out.println("for:\n");
                System.out.println("for (инициализация; условие; итерация) выражение;");
                break;

            case '4':
                System.out.println("while:\n");
                System.out.println("wile (условие) выражение;");
                break;

            case '5':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("выржажение;");
                System.out.println("} while (условие);");
                break;
            }
        }
    }
}
