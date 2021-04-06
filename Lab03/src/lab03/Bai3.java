/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Bai3  extends JFrame{
    private static final long serialVersionUID = 1L;
    
    public Bai3 (String title){
        setTitle(title);
        JPanel pnFlow= new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1= new JButton("FlowLayout");
        JButton btn2= new JButton("Add các Controler");
        JButton btn3= new JButton("Trên một dòng");
        JButton btn4= new JButton("Hết chổ chứa");
        JButton btn5= new JButton("Thì xuống dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con= getContentPane();
        con.add(pnFlow);
    }
    public static void main(String[] args) {
        Bai3 myUI=new Bai3("Demo FlowLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
