// остаток от деления %
class ostatok {
    public static void main (String args []) {
        int ires, irem;
        double dres, drem;

        ires = 10/3; irem = 10 % 3;
        dres = 10.0/3.0; drem = 10.0 % 3.0;

        System.out.println("целое число деление " + ires + "\tостаток " + irem
                + "\nдробное число деление " + dres + "\tостаток " + drem);
    }
}
