package chapter1.Project_2;

public class belajarMethod {

    public static void main(String[] args) {
        int i = 2;
        doVoidThis(i);
        System.out.println(i);
        printSomething("Balon", 5);
        printSomething("Gebetan",sum(3,5));

    }

    public static void doVoidThis(int i) {
        i = 4;
//        hasilnya tetap 2
//        karena method void tidak bisa mengembalikkan nilai
//        method void tidak bisa mempunyai parameter
    }

    public static int doThis(int i) {
        return 3;
//        hasilnya tetap 2
//        sedangkan method int bisa mengembalikkan nilai
    }

    public static void printSomething(String anyString, int anyInteger) {
        System.out.println(anyString + "Ku Ada " + anyInteger);
    }

    public static int sum(int angka1, int angka2) {
        return angka1 + angka2;
    }

}
