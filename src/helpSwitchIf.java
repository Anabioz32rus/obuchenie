// справочная система по if и switch
class helpSwitchIf {
    public static void main (String args []) throws java.io.IOException {
        char ch;

        System.out.println("Помощь по:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Выбери: ");
        ch = (char) System.in.read();

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
                System.out.println("\tпоследовательность выражений");
                System.out.println("\tbreak;");
                System.out.println("\t//...");
                System.out.println("default: последовательность выражений;");
                System.out.println("}");
                break;
            default:
                System.out.println("Выбор не найден");
        }
    }
}
