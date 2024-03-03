import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int soma = 0;

        try {
            System.out.print("Enter a date (dd/MM//yyyy): ");
            Date dt1 = sdf.parse(sc.next());
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {

                if (i == 5 || i == 7){
                    System.out.println("Number find: " + i);
                }
                else{
                    System.out.println("Different numbers ==> 5 and 7: " + i);
                    soma += i;
                }
            }
            System.out.println(dt1);
            System.out.println("The sum of different is: " + soma);
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        catch (ParseException e){
            System.out.println("Format date error");
        }
        sc.close();
    }
}
