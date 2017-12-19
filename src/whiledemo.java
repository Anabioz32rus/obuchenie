/* демонстрация цикла while
    Вывод латинского алфавита
 */
class whiledemo {
    public static void main (String args []) {
        char ch = 'a';
        int i = 1;

        while (ch <= 'z') {
            System.out.print(ch + "\t");
            i++; ch++;
            if (i == 10) {              // перевод строки через каждый 10-ый символ
                System.out.println("\n");
                i = 1;
            }
        }
    }
}
