package formyself.mainalarm;

import java.util.*;

import javax.swing.JOptionPane;


public class Alarm {
    Thread t;
    int str = 0;

    public void checkAlarm(int h, int m, int s) {
        final int a = h, b = m, c = s;


        final boolean whileloop = true;
        t = new Thread() {
            public void run() {

                while (whileloop == true) {
                    Calendar d = new GregorianCalendar();
                    int hours = d.get(Calendar.HOUR_OF_DAY);
                    int mins = d.get(Calendar.MINUTE);
                    int sec = d.get(Calendar.SECOND);
                    //System.out.println(hours + ":" + mins + ":" + sec);
                    if (a == hours && b == mins && c == sec) {
                        // AlarmClock ac=new AlarmClock(null, true);
                        JOptionPane.showMessageDialog(null, "Alarm Works!");
                        //  ac.getAlarm(message);

                        break;

                    }
                }

            }

        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }

    public static void main(String ar[]) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Write hour");
        int hr = sr.nextInt();
        System.out.println("Write minute");
        int mn = sr.nextInt();
        System.out.println("Write second");
        int sc = sr.nextInt();
        //System.out.println(hr + ":" + mn + ":" + sc);
        Alarm a = new Alarm();
        a.checkAlarm(hr, mn, sc);

    }

}