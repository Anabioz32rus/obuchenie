//
class GalToLitTable {
    public static void main (String args []) {
        double g, l;
        int c;
                // счетчик строк
        c = 0;
        for (g = 1; g <= 100; g ++) {
            l = g * 3.7854;
            System.out.println(g + " галонов равно " + l + " литров");
            c ++;
                    if (c == 10) {
                        System.out.println();
                        c = 0;
                    }
        }
    }
}
