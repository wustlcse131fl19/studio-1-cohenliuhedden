package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("First number?");
        int n2 = ap.nextInt("Second number?");

        System.out.println((double)(n1+n2)/2);

    }
}
