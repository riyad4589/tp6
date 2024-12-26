package mesTp.tp6.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class LoginView extends JFrame {

    private Color color_bg;
    private Font font_buttons;
    private JButton btn_login, btn_cancel;
    private JPanel pnl_main,pnl_buttons,pnl_banner,pnl_form,pnl_formFields,pnl_formIcons,pnl_linkButton ;

    private void initColors() {
        color_bg = new Color(202, 211, 242, 105);
    }

    private void initFonts() {
        font_buttons = new Font("Optima", Font.BOLD, 22);
    }

    private void initbuttons() {
        btn_login = new JButton("Login");
        btn_login.setIcon(new ImageIcon("LoginView/resources/icons/login.png"));
        btn_login.setFont(font_buttons);
        btn_login.setForeground(Color.BLUE);
        btn_login.setBackground(Color.WHITE);
        btn_login.setPreferredSize(new Dimension(130, 50));
        btn_login.setFocusable(false);
        btn_login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_login.setBackground(Color.BLUE);
                btn_login.setForeground(Color.WHITE);
                btn_login.setIcon(new ImageIcon("LoginView/resources/icons/loginhover.png"));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn_login.setForeground(Color.BLUE);
                btn_login.setBackground(Color.WHITE);
                btn_login.setIcon(new ImageIcon("resources/icons/login.png"));

            }
        });

        btn_cancel = new JButton("Cancel");
        btn_cancel.setIcon(new ImageIcon("resources/icons/cancel.png"));
        btn_cancel.setFont(font_buttons);
        btn_cancel.setForeground(Color.RED);
        btn_cancel.setBackground(Color.WHITE);
        btn_cancel.setPreferredSize(new Dimension(130, 50));
        btn_cancel.setFocusable(false);
        btn_cancel.addActionListener(whenClicked -> System.exit(0));
        btn_cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_cancel.setBackground(Color.RED);
                btn_cancel.setForeground(Color.WHITE);
                btn_cancel.setIcon(new ImageIcon("resources/icons/cancelhover.png"));

            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn_cancel.setForeground(Color.RED);
                btn_cancel.setBackground(Color.WHITE);
                btn_cancel.setIcon(new ImageIcon("resources/icons/cancel.png"));
            }
        });

    }

    public LoginView() {
            initComponents();
            setTitle("Login");
            setSize(500, 600);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(false);
            setUndecorated(false);
            setAlwaysOnTop(true);
    }

    public JPanel getPnl_main() {
        return pnl_main;
    }

    public void setPnl_main(JPanel pnl_main) {
        this.pnl_main = pnl_main;
    }

    private void initPanel() {

        pnl_form = new JPanel();
        pnl_form.setBackground(Color.WHITE);
        pnl_form.setPreferredSize(new Dimension(485, 181) );
        pnl_form.setBorder(new EmptyBorder(0,3,3,3));
        pnl_form.setLayout(new BorderLayout());
                        pnl_formIcons = new JPanel();
                        pnl_formIcons.setBackground(Color.MAGENTA);
                        pnl_formIcons.setBorder(new EmptyBorder(10,10,5,10));
                        pnl_formIcons.setLayout(new GridLayout(2,1,0,20));

                        pnl_formFields = new JPanel();
                        pnl_formFields.setBackground(Color.ORANGE);
                        pnl_formFields.setBorder(new EmptyBorder(10,10,5,10));
                        pnl_formFields.setLayout(new GridLayout(2,1,0,20));

                        pnl_linkButton = new JPanel();
                        pnl_linkButton.setBackground(Color.BLUE);
                        pnl_linkButton.setBorder(new EmptyBorder(1,1,1,8));
                        pnl_linkButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl_form.add(pnl_formIcons, BorderLayout.WEST);
        pnl_form.add(pnl_formFields, BorderLayout.CENTER);
        pnl_form.add(pnl_linkButton, BorderLayout.SOUTH);

        pnl_banner = new JPanel();
        pnl_banner.setBackground(Color.RED);
        pnl_banner.setLayout(new GridLayout(1, 1));
        pnl_banner.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2, true));
        pnl_banner.setPreferredSize(new Dimension(485, 307) );


        pnl_buttons = new JPanel();
        pnl_buttons.setBackground(Color.BLACK);
        pnl_buttons.setLayout(new FlowLayout(FlowLayout.RIGHT,10,0));
        pnl_buttons.setBorder(new EmptyBorder(0, 0, 2, 13));
        pnl_buttons.setPreferredSize(new Dimension(485, 69) );
        pnl_buttons.add(btn_login);
        pnl_buttons.add(btn_cancel);


        pnl_main = new JPanel();
        pnl_main.setBackground(color_bg);
        pnl_main.setLayout(new BorderLayout());
        pnl_main.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(pnl_main);

        pnl_main.add(pnl_buttons, BorderLayout.SOUTH);
        pnl_main.add(pnl_banner, BorderLayout.NORTH);
        pnl_main.add(pnl_form, BorderLayout.CENTER);
    }

    private void initComponents() {
     initColors();
     initFonts();
     initbuttons();
     initPanel();
    }
}
