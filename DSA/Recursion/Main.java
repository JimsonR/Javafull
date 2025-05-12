package Recursion;



public class Main {
    /*

    recursion = When a thing is defined in terms of itself.
    Apply the result of a procedure, to a procedure.
    A recursive method calls itself. Can be a substitute for iteration.
    Divide a problem into sub-problems of the same type as the original.
    Commonly used with advances sorting algorithms and navigating trees.

    Advantages
    ----------
    easier to read/write
    easier to debug

    Disadvantages
    -------------
    sometimes slower
    uses more memory

     */
    public static void main(String[] args) {


        walk(1000000000);

        System.out.println(factorial(6));

        System.out.println(power(2, 8));


    }

    private static int power(int num, int pow) {
        if(pow < 1)return 1;
        return num*power(num,pow-1);
    }

    private static int factorial(int num) {
        if(num < 1){
            return 1;
        }

   return num*factorial(num-1);
    }

    private static void walk(int steps) {
        if(steps<1)return;// base case - when you want to stop
//        steps--; //can use this too
        System.out.println("you take a step!");
        walk(steps-1);// recursive case
    }
}
/*
(Imp)
Call stack - programs have data structure called a call stack. call stack keeps the order in which the programs need to function.
so with the main method, we call the main method first and that is added to the bottom of or call stack. So in order t complete then we have to complete the main method and get to the end of it.
However, when we took an iterative approach we invoked the walk method and that was added to the top of our stack(lifo - need to take care of the top of the stack to get to bottom)
With a recursive approach, we are adding multiple frames onto our call stack, because one, we are calling the main method and then we are calling wallk method passing in 5 as an argument and then we are calling in walk method passing in 4 as an argument, then 3,2 ,1 , then 0 and then we return and
we have to solve this in a lifo order, we begin at the top and remove frames from the top until we reach th end, thats why using recursion is sometimes slower and uses more memory

 */