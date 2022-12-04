//First level:  1) Работа со String
//              2) Продемонстировать явное и неявное приведение типов
//              3) Показать переполнение
//              4) Показать работу с методами и классами
//              5*) Сделать реверс строки
public class Main {

    public static void main(String[] args) {
        //1) Работа со String.
        String strFirst;
        String strSecond;
        strFirst = " Hello";
        strSecond = " world!";
        System.out.println(strFirst.length());
        System.out.println(strFirst.concat(strSecond));

        //2) Продемонстировать явное и неявное приведение типов.
        int x = 3;
        short y = 11;
        y = (short) x;
        System.out.println(y);

        //3) Показать переполнение.
        byte a = 127;
        a += 1;
        short b = 32767;
        b += 1;
        long c = 9223372036854775807L;
        int d = 2147483647;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c + 1);
        System.out.println(d + 1);

        //4) Показать работу с методами и классами.
        int x1 = 50;
        int y1 = 50;
        Wunderbar.Process();
        Wunderbar.ProcessWithArg(x1, y1);
        System.out.println(Wunderbar.Function());
        System.out.println(Wunderbar.FunctionWithArg(x1, y1));
        System.out.println(Wunderbar.FunctionStr());
        System.out.println(Wunderbar.FunctionStrWithArg(strFirst, strSecond));

    }
}