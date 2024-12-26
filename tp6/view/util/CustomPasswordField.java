package mesTp.tp6.view.util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CustomPasswordField extends JPasswordField {
    private String hint = "Enter password"; // Le texte du placeholder (hint)
    private int arcWidth = 20; // Largeur des coins arrondis
    private int arcHeight = 20; // Hauteur des coins arrondis
    private Color borderColor = new Color(100, 150, 255); // Couleur de la bordure
    private Color backgroundColor = new Color(240, 240, 240); // Couleur de fond
    private Font lostFont, gainFont;
    private Color gainColor;

    public Color getGainColor() {
        return gainColor;
    }

    public void setGainColor(Color gainColor) {
        this.gainColor = gainColor;
        setForeground(gainColor);
        repaint();
    }

    public Font getLostFont() {
        return lostFont;
    }

    public void setLostFont(Font lostFont) {
        this.lostFont = lostFont;
        repaint();
    }

    public Font getGainFont() {
        return gainFont;
    }

    public void setGainFont(Font gainFont) {
        this.gainFont = gainFont;
        setFont(gainFont);
        repaint();
    }

    public CustomPasswordField() {
        setOpaque(false); // Rendre le champ transparent pour dessiner le fond nous-mêmes
        setBorder(new EmptyBorder(5, 10, 5, 10)); // Espacement intérieur

    }

    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    public void setArc(int arcWidth, int arcHeight) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        repaint();
    }

    public String getHint() {
        return hint;
    }

    public int getArcWidth() {
        return arcWidth;
    }

    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    public int getArcHeight() {
        return arcHeight;
    }

    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Activer l'anti-aliasing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dessiner le fond avec des coins arrondis
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);

        // Dessiner la bordure
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);

        // Dessiner le texte ou le hint
        if (getPassword().length == 0 && !isFocusOwner()) {
            g2.setColor(Color.GRAY);
            g2.setFont(lostFont);
            g2.drawString(hint, getInsets().left, getHeight() / 2 + g2.getFontMetrics().getAscent() / 2 - 3);
        } else {
            super.paintComponent(g);
        }
    }
}

