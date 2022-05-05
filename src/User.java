import java.util.Scanner;

public class User {

  public static void main(String[] args) {

    double product_countity;
    double product_price;
    double total_Price;
    double discount = 0;
    double utah = 0.0685;
    double state_tax_price;


    Scanner scan = new Scanner(System.in);

    System.out.println("please enter pruduct countity and price per product");

    product_countity = scan.nextInt();

    product_price = scan.nextInt();

    total_Price = product_price*product_countity;

    System.out.println("Total price" + total_Price);


    if (total_Price > 50000) {
      discount = total_Price*1.15;
    }
    else if (total_Price > 10000) {
      discount = total_Price*1.10;
    }
    else if (total_Price > 7000) {
      discount = total_Price*1.07;
    }
    else if (total_Price > 5000) {
      discount = total_Price*1.05;
    }
    else if (total_Price > 1000) {
      discount = total_Price*1.03;
    }

    state_tax_price = discount * (1 - utah);

    System.out.println(state_tax_price);

  }

}
