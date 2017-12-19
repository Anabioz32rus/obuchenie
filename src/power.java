// вычисление степени двойки от нулевой до девятой
class power {
    public static void main (String args []) {
        int e, res;

        for (int i = 0; i < 10; i++) {
            res = 1;
            e = i;
            while (e > 0) {
                res *= 2;
                e--;
            }
            System.out.println("2 в степени " + i + " равно " + res);
        }
    }
}
