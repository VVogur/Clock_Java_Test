package formyself.openapp;

import java.io.IOException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws IOException {
        Scanner sr = new Scanner(System.in);
        Runtime rs = Runtime.getRuntime();

        System.out.println("Enter the:\n" +
                "1. Notepad\n" +
                "2. Paint\n" +
                "3. Calculator\n" +
                "4. Google Chrome\n" +
                "5. Microsoft Edge\n" +
                "6. Word\n" +
                "7. Excel\n" +
                "8. Explorer\n" +
                "9. Windows Media Player\n" +
                "10. WARNING - Timer for shutdown PC\n" +
                "11. Cancel timer");
        
        int a = sr.nextInt();

        switch (a) {
            case 1:
                rs.exec("notepad");
                break;
            case 2:
                rs.exec("mspaint");
                break;
            case 3:
                rs.exec("calc");
                break;
            case 4:
                rs.exec("chrome"); //doesn't work
                break;
            case 5:
                rs.exec("msedge"); //doesn't work
                break;
            case 6:
                rs.exec("winword"); //doesn't work
                break;
            case 7:
                rs.exec("excel"); //doesn't work
                break;
            case 8:
                rs.exec("explorer");
                break;
            case 9:
                rs.exec("wmplayer");
                break;
            case 10:
                System.out.println("Write only seconds");
                int b = sr.nextInt();
                rs.exec("shutdown -s - t " + b); //doesn't work
                break;
            case 11:
                rs.exec("shutdown -a"); //doesn't work
                break;
            default:
                break;

        }
    }
}
