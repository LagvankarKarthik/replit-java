package day3;

public class Operators {
  public static void main(String[] args) {
    //Arithametic operators
    int a = 10, b = 5;
    int result = a + b;
    System.out.println("The sum of the numbers is: "+(a + b)); //15
    System.out.println("The difference of the numbers is: "+(a-b));
    System.out.println("The product of the numbers is "+(a*b));
    System.out.println("The reminder of the numbers is "+(a%b));
    System.out.println("The quotient of the numbers is "+(a/b));

    System.out.println("The result of adding the two numbers is: "+result);

    //Relational operators
    System.out.println("Is a equal to b? "+(a==b));
    //Relational operators return Bolean value i.e true or false

    int num1 = 10, num2 = 10;
    boolean isEqual = (num1==num2);
    System.out.println("The result is: " + isEqual);
    //Pascak Naming Convention for classes and camel naming convention for functions
  }
}