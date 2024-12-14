import java.util.Scanner;

public class Useover {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double val1;
        double val2;
        double val3;
        double result;
        while (true) {
            System.out.println("There are 5 operators Give");
            System.out.println("(1) for Addition");
            System.out.println("(2) for Subract");
            System.out.println("(3) for Multiplication");
            System.out.println("(4) for Division");
            System.out.println("(5) for EXIT");
            System.out.println("Enter the number");
            n = scanner.nextInt();
            if (n == 1) {
                System.out.println("1(two inputs),2(three inputs)");
                int n1;
                n1 = scanner.nextInt();
                if (n1 == 1) {
                    System.out.println("Enter the values");
                    val1 = scanner.nextDouble();
                    val2 = scanner.nextDouble();
                    result=Evaluvate.addition(val1,val2);

                    System.out.println(result);

                } else if (n1 == 2) {
                    System.out.println("Enter the values");
                    val1 = scanner.nextDouble();
                    val2 = scanner.nextDouble();
                    val3 = scanner.nextDouble();
                    result=Evaluvate.addition(val1,val2,val3);
                    System.out.println(result);
                }
                if (n == 2) {
                    System.out.println("1(two inputs),2(three inputs)");
                    int n2;
                    n2 = scanner.nextInt();
                    if (n2 == 1) {
                        System.out.println("Enter the values");
                        val1 = scanner.nextDouble();
                        val2 = scanner.nextDouble();
                        result=Evaluvate.subtraction(val1,val2);
                        System.out.println(result);

                    } else if (n2 == 2) {
                        System.out.println("Enter the values");
                        val1 = scanner.nextDouble();
                        val2 = scanner.nextDouble();
                        val3 = scanner.nextDouble();
                        result=Evaluvate.subtraction(val1,val2,val3);
                        System.out.println(result);
                    }
                    if (n == 3) {
                        System.out.println("1(two inputs),2(three inputs)");
                        int n3;
                        n3 = scanner.nextInt();
                        if (n3 == 1) {
                            System.out.println("Enter the values");
                            val1 = scanner.nextDouble();
                            val2 = scanner.nextDouble();
                            result=Evaluvate.multiplication(val1,val2);
                            System.out.println(result);
                        } else if (n2 == 2) {
                            System.out.println("Enter the values");
                            val1 = scanner.nextDouble();
                            val2 = scanner.nextDouble();
                            val3 = scanner.nextDouble();
                            result=Evaluvate.multiplication(val1,val2,val3);
                            System.out.println(result);
                        }
                        if (n == 4) {
                            System.out.println("1(two inputs),2(three inputs)");
                            int n4;
                            n4 = scanner.nextInt();
                            if (n4 == 1) {
                                System.out.println("Enter the values");
                                val1 = scanner.nextDouble();
                                val2 = scanner.nextDouble();
                                result=Evaluvate.division(val1,val2);
                                System.out.println(result);
                            } else if (n4 == 2) {
                                System.out.println("Enter the values");
                                val1 = scanner.nextDouble();
                                val2 = scanner.nextDouble();
                                val3 = scanner.nextDouble();
                                result=Evaluvate.division(val1,val2,val3);
                                System.out.println(result);
                            }
                        }
                        if(n==5)
                        {
                            break;
                        }
                    }
                }
            }
        break;}

    }
}
