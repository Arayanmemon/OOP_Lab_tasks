import javax.swing.JFrame;
import javax.swing.JTextField;

public class print {
    JFrame f;
    print(String name, String roll, String batch, String section, String Gender, String Qualification, String Address, String Country){
        f = new JFrame();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        JTextField t5 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();
        JTextField t8 = new JTextField();


        t1.setText(name);
        t2.setText(roll);
        t3.setText(batch);
        t4.setText(section);
        t5.setText(Gender);
        t6.setText(Qualification);
        t7.setText(Address);
        t8.setText(Country);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        t1.setBounds(150,50,150,30);
        t2.setBounds(150,100,150,30);
        t3.setBounds(150,150,150,30);
        t4.setBounds(150,200,150,30);
        t5.setBounds(150,250,150,30);
        t6.setBounds(150,300,150,30);
        t7.setBounds(150,400,150,30);
        t8.setBounds(150,480,150,30);


        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true); 

    }
}
