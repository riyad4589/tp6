package mesTp.tp6.view.util;

import javax.swing.*;
import java.awt.*;

public class Tools {

    public static ImageIcon resizeImage(ImageIcon originalIcon,
                                        int newWidth, int newHeight){
        Image img = originalIcon.getImage();
        Image zoom = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        return new ImageIcon(zoom);
    }
}
