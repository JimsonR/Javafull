package Subpack;

import Mypack.Accesspractise;

public class Accessor extends Accesspractise {
    public static void main(String[] args) {
        System.out.println(Accessor.j);
        System.out.println(new Accesspractise().nonStatic_l);
        System.out.println(new Accessor().nonStatic_k);
    }
}
