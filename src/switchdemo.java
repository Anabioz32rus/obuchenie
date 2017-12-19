// пример использования оператора switch
class switchdemo
{
    public static void main (String args [])
    {
        int i;

        for (i = 0; i < 10; i++)
            switch (i)
            {
                case 0:
                    System.out.println(i + " i is a zero");
                    break;
                case 1:
                    System.out.println(i + " i is a one");
                    break;
                case 2:
                    System.out.println(i + " i is a two");
                    break;
                case 3:
                    System.out.println(i + " i is a three");
                    break;
                case 4:
                    System.out.println(i + " i is a four");
                    break;
                default:
                    System.out.println(i + " i is five or more");
            }
    }
}
