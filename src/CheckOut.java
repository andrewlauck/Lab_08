import java.util.Scanner;

public class CheckOut
{

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            double itemPrice = 0;
            double totalPrice =0;
            boolean newItem = false;

            do
            {
                itemPrice = SafeInput.getRangedDouble(in, "Enter price of item [0.50-9.99]:", 0.50 ,9.99);
                totalPrice = totalPrice + itemPrice;
                newItem = SafeInput.getYnConfirm(in, "Do you have another item? [y/N]: ");
            } while(newItem);
        }
}
