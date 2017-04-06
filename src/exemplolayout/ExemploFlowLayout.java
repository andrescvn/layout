/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author acomesanavila
 */
public class ExemploFlowLayout {

    public void AmosarVenta() {
        JFrame marco = new JFrame("*** LAYOUTS *****");
        JPanel panel = new JPanel();
        JButton bo1 = new JButton("Boton 1");
        JButton bo2 = new JButton("Boton 2");
        JButton bo3 = new JButton("Boton 3");
        JButton bo4 = new JButton("Boton 4");
        JButton bo5 = new JButton("Boton 5");
        //panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));//separacion horizontal y vertical 10,20
        // panel.setLayout(new GridLayout(2, 3));//filas y columnas
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//vertical o horizontal
        
//        panel.setLayout(new BorderLayout());
//        panel.add(bo1, BorderLayout.WEST);
//        panel.add(bo2, BorderLayout.CENTER);
//        panel.add(bo3, BorderLayout.EAST);
//        panel.add(bo4, BorderLayout.NORTH);
//        panel.add(bo5,BorderLayout.SOUTH);

        panel.add(bo1);
        panel.add(bo2);
        panel.add(bo3);
        panel.add(bo4);
        panel.add(bo5);
        marco.add(panel);
        marco.setBounds(500, 500, 400, 500);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
