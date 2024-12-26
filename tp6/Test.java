package mesTp.tp6;

import mesTp.tp6.view.LoginView;

import javax.swing.*;


public class Test {
    public static void main(String[] args) throws Exception  {
        //edt
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        SwingUtilities.invokeLater(LoginView::new);
    }
}
