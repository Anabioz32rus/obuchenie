// вычисление гиппотенузы теоремой пифагора
class hipot {
    public static void main (String args []) {
        double x, y, z;

        x = 3; y = 4;

        z = Math.sqrt(x * x + y * y);

        System.out.println("Гиппотенуза при катенах, равных " + x + " и " + y + " равна " + z);
    }
}
