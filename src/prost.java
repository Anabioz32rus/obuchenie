// простые числа от 0 до 100
class prost {
    public static void main (String args []) {
        int n, x = 5;
        System.out.println("Простые числа от 1 до 100:");
        System.out.print("2\t3\t5\t7\t"); // выписываем простые числа до 7

        // проверяем делимость остальных чисел на простые числа 2, 3, 5, 7
        for (n = 8; n <= 100; n++) {
            if ((n % 2) != 0) { if ((n % 3) != 0) { if ((n % 5) != 0) { if ((n % 7) != 0)
            {
                ++x;  // счетчик строк
                System.out.print(n + "\t"); // вывод простых чисел до 100
            }
            if (x == 10) { x = 1; System.out.print("\n");}
                    }
                }
            }
        }
    }
}
