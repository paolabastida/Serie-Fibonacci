public class Recursividad {

    /* @Author: Paola Bastida.
     */

    public static int funcionFibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return funcionFibonacci(num - 1) + funcionFibonacci(num - 2);
    }

    public static void main(String[] args) {
        funcionFibonacci(6);
        System.out.println("Numero Fibonacci" + " " + funcionFibonacci(6));
    }
}
