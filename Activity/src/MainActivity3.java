/*
*   MEMBERS:
*   SECUYA, JESSAH R.
*   ROSELL, MARY GRACE M.
*   SINANGOTE, BILMARK C.
*   TEJENO, JEANCIN S.
*/
import java.util.Scanner;
public class MainActivity3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Print print = new Print();
        NewDisplay newDisplay = new NewDisplay();
        print.choiceDisplay();
        System.out.print("Enter your choice -> ");
        print.setChoice(scanner.nextInt());
        String type = print.getType();

        System.out.print("Enter mode of Transportation -> ");
        String modeOfTranspo = scanner.next();

        System.out.print("Enter ruoute -> ");
        String route = scanner.next();

        newDisplay.show(type, modeOfTranspo, route);

    }
}
