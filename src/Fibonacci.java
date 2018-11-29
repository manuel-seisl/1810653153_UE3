public class Fibonacci
{

    public static void main(String[] args)
    {

        System.out.println(rekursiv(8));
        System.out.println(iterative(8));

    }

    public static int rekursiv(int i){

        /* Die iterative Variante ist nicht performant,
           da es sich selbst aufruft und die Methode parallel mehrfach läuft
        */

        if(i <= 0){
            return 0;
        } else if(i == 1){
            return 1;
        } else {
            return rekursiv(i - 2) + rekursiv(i - 1);
        }

    }

    public static int iterative(int j){

        /* Die iterative Variante ist viel performanter,
           da nur so viele Schleifendurchgänge gemacht werden, wie notwendig
        */

        if(j <= 1){
            return j;
        }

        int fibonacci = 1;
        int prevFibonacci = 1;

        for(int i = 2; i < j; i++){
            int temp = fibonacci;
            fibonacci += prevFibonacci;
            prevFibonacci = temp;
        }

        return fibonacci;

    }

}
