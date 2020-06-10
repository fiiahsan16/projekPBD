/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokofattahbusana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class SplashScreen extends JWindow {
    private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel labellogo = new JLabel (new ImageIcon("C:\\Users\\Asus\\Pictures\\polije.jpg"));
    private JProgressBar barisProgres = new JProgressBar();
    private int time=0;
    private Timer timer;
public SplashScreen (){
    Color Warna = Color.BLUE;
    barisProgres.setValue(0);
    barisProgres.setPreferredSize(new Dimension(100,15));
    barisProgres.setBackground(Color.white);
    barisProgres.setForeground(Color.red);
    barisProgres.setStringPainted(true);
    barisProgres.setBorder(new LineBorder(Warna,1));
    labellogo.setBorder(new LineBorder(Warna,1));
    getContentPane().add(labellogo,BorderLayout.NORTH);
    getContentPane().add(barisProgres,BorderLayout.CENTER);
    timer = new Timer (200,new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            time++;
            barisProgres.setValue(time);
            if(barisProgres.getPercentComplete()==1.0){
                timer.stop();
                setVisible(false);
            }
        }
    });
    timer.start();
    pack();
    setLocation(dimension.width/2-getWidth()/2,dimension.height/2-getHeight()/2);
    show();
}
    public static void main(String[] args) {
        new SplashScreen();
    }
}
