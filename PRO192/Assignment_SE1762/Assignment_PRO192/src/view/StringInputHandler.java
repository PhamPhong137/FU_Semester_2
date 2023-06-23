/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class StringInputHandler {

    public static boolean CheckStringLegal(String inputString, String nameString) {
        String inputStr0 = inputString; // Đầu vào cần kiểm tra
        String nameHandler0 = nameString;

       
      

        if (inputStr0.trim().length() == 0 ){
            JPanel panel = new JPanel(new GridBagLayout());
            JLabel label = new JLabel("Lỗi nhập sai đầu vào ở " + nameHandler0 + ", mời nhập lại!");

// create a GridBagConstraints object
            GridBagConstraints gbc = new GridBagConstraints();

// set the anchor to center so that the label is centered in the panel
            gbc.anchor = GridBagConstraints.CENTER;

// add the label to the panel using the GridBagConstraints object
            panel.add(label, gbc);

// set preferred size for panel
            panel.setPreferredSize(new Dimension(400, 200));

            JFrame frame = new JFrame("Error Message Panel");
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
            return false;
        } else {
            return true;
        }
    }
  
}
