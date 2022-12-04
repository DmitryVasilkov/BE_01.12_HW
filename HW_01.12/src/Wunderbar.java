public class Wunderbar {
    public static void Process() { //процедура без аргументов.
        System.out.println(1 + 1);
    }
    public static void ProcessWithArg(int a, int b) {//процедура с аргументами.
        System.out.println(a + b);
    }
    public static int Function() {  //функция int без арнументов.
        return 1 + 1;
    }
    public static int FunctionWithArg(int a, int b) {//функция int с аргументами.
        return a + b;
    }
    public static String FunctionStr() { //функция string без аргументов.
        return "Mit freundlichen grüßen";
    }
    public static String FunctionStrWithArg(String a, String b) {//функция string с аргументами.
        return ("Salam" + a + b);
    }
}