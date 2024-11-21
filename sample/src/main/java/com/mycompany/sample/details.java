/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sample;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jevan
 */
public class details {
    public static void showDetailView(String title, String description, BufferedImage image) {
    JFrame detailFrame = new JFrame("Detail View");
    detailFrame.setSize(400, 400); 
    detailFrame.setLocationRelativeTo(null); 

    JPanel detailPanel = new JPanel();
    detailPanel.setLayout(new BoxLayout(detailPanel, BoxLayout.Y_AXIS));
    detailPanel.setBackground(Color.WHITE);
    detailPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    JLabel titleLabel = new JLabel(title);
    titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
    titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    detailPanel.add(titleLabel);

    ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(200, 150, Image.SCALE_SMOOTH));
    JLabel imageLabel = new JLabel(imageIcon);
    imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    detailPanel.add(imageLabel);

    JLabel descriptionLabel = new JLabel("<html><p style='width:300px;'>" + description + "</p></html>");
    descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
    descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    detailPanel.add(descriptionLabel);

    JButton closeButton = new JButton("Close");
    closeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    closeButton.addActionListener(e -> detailFrame.dispose());
    detailPanel.add(Box.createVerticalStrut(10)); 
    detailPanel.add(closeButton);

    detailFrame.add(detailPanel);
    detailFrame.setVisible(true); 
}
}
