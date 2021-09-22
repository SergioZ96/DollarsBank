

import java.util.Scanner;

import com.dollarsbank.controller.*;
import com.dollarsbank.model.*;
import com.dollarsbank.utility.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        runUI();
    }

    public static void runUI(){

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        
        while(flag) {

            headerTitle("Some title");
            
        }
        

    }

    public static void printPage(Titles title) {
        // characters for header
        String plus = "+";
        String dash = "-";
        String pipe = "|";


        switch(title) {
            case MAIN:
                printHeader(title);

                System.out.println("1.  Create New Account\n2.  Login\n3.   Exit.");
                break;
            case CREATE_ACCOUNT:
                printHeader(title);
                break;
            case LOGIN:
                printHeader(title);
                break;
            case SUCCESS_LOGIN:
                printHeader(title);
                break;
            case DEPOSIT:
                printHeader(title);
                break;
            case WITHDRAW:
                printHeader(title);
                break;
            case FUNDS_TRANSFER:
                printHeader(title);
                break;
            case RECENT_TRANS:
                printHeader(title);
                break;
            case DISP_CUST_INFO:
                printHeader(title);
                break;
            
            default:
                
                break;

        }


        
    }

    public static void printHeader(Titles title) {
        System.out.println(Colors.ANSI_BLUE + plus + dash.repeat(2 + title.length()) + plus);
        System.out.println(pipe + " " + title + " " + pipe);
        System.out.println(plus + dash.repeat(2 + title.length()) + plus + Colors.ANSI_RESET);
    }


}
