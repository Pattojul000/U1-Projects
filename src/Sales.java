import javax.swing.JOptionPane;


public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10

    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Subtotal = sale Price * quantity * (1 - discount)
    Tax Total: $1.57
    Total Tax  = subtotal * salesTax
    Total Cost: $24.03
     */
    public static void main(String[] args) {
        int quantity, discount, salesTax;
        double price, subTotal, total, taxTotal, totalCost;



        price = Double.parseDouble(JOptionPane.showInputDialog("How much does it cost?"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));

        total = price * quantity;

        JOptionPane.showMessageDialog(null, "Your cost without a discount is: " + total);



        discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount? (In an integer)"));

        final double discountRate = discount * .01;

        subTotal = (1 - discountRate)* total;

        JOptionPane.showMessageDialog(null, "Your subtotal is: " + subTotal);

        salesTax = Integer.parseInt(JOptionPane.showInputDialog("What is your Tax? (In an Integer)"));

        final double taxRate = salesTax * .01;

        JOptionPane.showMessageDialog(null, "Your Tax rate is : " + taxRate);

        taxTotal = subTotal * taxRate;

        JOptionPane.showMessageDialog(null,"Your Tax Total is : " + taxTotal);

        totalCost = (1 + taxRate) * subTotal;

        JOptionPane.showMessageDialog(null, "Your total cost is: " + totalCost);








        System.exit(0);

    }



}
