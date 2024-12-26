package mesTp.tp6.view.util;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class HintTextField extends JTextField {

    Font gainFont, lostFont;
    Color gainColor, lostColor;

    public HintTextField(final String hint) {
        setText(hint);
        setForeground(lostColor);
        setFont(lostFont);
        setHorizontalAlignment(JTextField.CENTER);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.DARK_GRAY, 2, true));

        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (getText().equals(hint)) {
                    setText("");
                    setFont(gainFont);
                    setForeground(gainColor);
                } else {
                    setText(getText());
                    setFont(gainFont);
                    setForeground(gainColor);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().equals(hint) || getText().length() == 0) {
                    setText(hint);
                    setFont(lostFont);
                    setForeground(lostColor);
                } else {
                    setText(getText());
                    setFont(gainFont);
                    setForeground(gainColor);
                }
            }
        });
    }

    public void setGainFont(Font gainFont) {
        this.gainFont = gainFont;
    }

    public void setLostFont(Font lostFont) {
        this.lostFont = lostFont;
    }

    public void setGainColor(Color gainColor) {
        this.gainColor = gainColor;
    }

    public void setLostColor(Color lostColor) {
        this.lostColor = lostColor;
    }
}
