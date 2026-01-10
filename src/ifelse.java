import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//
//        if ( age >= 18){
//            System.out.println("you are eligible for vote");
//        }
//        else{
//            System.out.println("you are not eligible for vote! Better luck next time");
//        }


//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        if (num % 2 == 0){
//            System.out.println("This is a even number");
//        }
//        else{
//            System.out.println("This is a odd number");
//        }


        // if else ladder
//        System.out.println("Enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter the value of c23: ");
//        int c = sc.nextInt();
//        if(a>=b & a>=c){
//            System.out.println("a is the largest");
//        }
//        else if(b > c){
//            System.out.println("b is largest");
//        }
//        else{
//            System.out.println("c is largest");
//        }


        // Nested ifelse
//        System.out.println("Enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter the value of c23: ");
//        int c = sc.nextInt();
//        if (a>=b){
//            if(a>=c){
//                System.out.println("a is the largest");
//            }
//            else{
//                System.out.println("c is the largest");
//            }
//        }
//        else{
//            if(b>=a){
//                if(b>=c){
//                    System.out.println("b is the largest");
//                }
//                else{
//                    System.out.println("c is the largest");
//                }
//            }
//        }


        System.out.println("Enter your mark");
        int percentage = sc.nextInt();
        if (percentage >= 90) {
            System.out.println("grade  = A");
        } else {
            if (percentage >= 80 && percentage <= 89) {
                System.out.println("grade  = B");
            } else {
                if (percentage >= 60 && percentage <= 79) {
                    System.out.println("grade  = C");
                } else {
                    if (percentage >= 33 && percentage <= 59) {
                        System.out.println("grade  = D");
                    } else {
                        System.out.println("grade  = F");
                    }


                }
            }
        }
    }
}

