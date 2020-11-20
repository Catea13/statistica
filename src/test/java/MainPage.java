

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/***In the class we create forms,buttons,actions...**/
public class MainPage extends JFrame{ /*** We need extends JFrame class because this class has methods for created forms**/
JLabel name=new JLabel("Introduceti Numele");
JTextField lastName=new JTextField("",5);
JButton start=new JButton("Start");
JLabel welcome=new JLabel ("Binea ati venit la examen");
MainPage(){
    super("Statistica");/**name my Form**/
    this.setBounds(100,100,250,100);/***size **/
    setDefaultCloseOperation(EXIT_ON_CLOSE);/***close the form**/

    Container container=this.getContentPane();/***In this form we will put all elements from class Main page**/
    container.add(name);
    container.add(lastName);
    container.add(start);
    container.add(welcome);

    /***Create action to button**/
    start.addActionListener(new FirstAction());


}
class FirstAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String message="";
        message="Succes"+name.getText();
    }
}
}
