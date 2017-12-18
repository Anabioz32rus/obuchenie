// демонстрация типа long
class longdemo {
    public static void main (String args []) {
        long ci, im;

        im = 5280 * 12;
        ci = im * im * im;
// результирующее число не может храниться в int
        System.out.println(ci + " кубических дюймов в кубической миле");
    }
}
