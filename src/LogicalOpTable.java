// Вывод таблицы истинности для логических операторов
class LogicalOpTable {

   /*
    public static void main (String args []) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.println(p + "\t" + q + "\t"
                + (p & q) + "\t" + (p | q) + "\t"
                + (p ^ q) +"\t" + (! p));

        p = true; q = false;
        System.out.println(p + "\t" + q + "\t"
                + (p & q) + "\t" + (p | q) + "\t"
                + (p ^ q) +"\t" + (! p));

        p = false; q = true;
        System.out.println(p + "\t" + q + "\t"
                + (p & q) + "\t" + (p | q) + "\t"
                + (p ^ q) +"\t" + (! p));

        p = false; q = false;
        System.out.println(p + "\t" + q + "\t"
                + (p & q) + "\t" + (p | q) + "\t"
                + (p ^ q) +"\t" + (! p));

    }
*/

    // заменяем вывод true на 1, false на 0.
    public static void main (String args []) {
        boolean p, q; byte p1 = 0, q1 = 0, a1 = 0, o1 = 0, x1 = 0, n1 = 0;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        if (p) p1 = 1; if (q) q1 = 1; if (p & q) a1 = 1; if (p | q) o1 = 1; if (p ^ q) x1 = 1; if (!p) n1 = 1;
        System.out.println(p1 + "\t" + q1 + "\t" + a1 + "\t" + o1 + "\t" + x1 + "\t" + n1);

        p1 = 0; q1 = 0; a1 = 0; o1 = 0; x1 = 0; n1 = 0;
        p = true; q = false;
        if (p) p1 = 1; if (q) q1 = 1; if (p & q) a1 = 1; if (p | q) o1 = 1; if (p ^ q) x1 = 1; if (!p) n1 = 1;
        System.out.println(p1 + "\t" + q1 + "\t" + a1 + "\t" + o1 + "\t" + x1 + "\t" + n1);

        p1 = 0; q1 = 0; a1 = 0; o1 = 0; x1 = 0; n1 = 0;
        p = false; q = true;
        if (p) p1 = 1; if (q) q1 = 1; if (p & q) a1 = 1; if (p | q) o1 = 1; if (p ^ q) x1 = 1; if (!p) n1 = 1;
        System.out.println(p1 + "\t" + q1 + "\t" + a1 + "\t" + o1 + "\t" + x1 + "\t" + n1);

        p1 = 0; q1 = 0; a1 = 0; o1 = 0; x1 = 0; n1 = 0;
        p = false; q = false;
        if (p) p1 = 1; if (q) q1 = 1; if (p & q) a1 = 1; if (p | q) o1 = 1; if (p ^ q) x1 = 1; if (!p) n1 = 1;
        System.out.println(p1 + "\t" + q1 + "\t" + a1 + "\t" + o1 + "\t" + x1 + "\t" + n1);
           }
}
