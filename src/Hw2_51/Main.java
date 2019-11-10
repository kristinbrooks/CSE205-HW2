//**************************************************************************************************
// CLASS: Main
//**************************************************************************************************
package Hw2_51;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] pArgs) {
        new Main().run();
    }

    private void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new View();
    }

}
