// вычисление квадратного корня чисел от 1 до 99 и ошибки округления
class SqrRoot {
    public static void main (String args []) {
        double num, sroot, rerr;

        for (num = 1.0; num <= 99.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Квадратный корень " + num + " равен " + sroot);

            // вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления равна " + rerr);
            System.out.println();
        }
    }
}
