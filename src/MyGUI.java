import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame {

    String[] stateList;
    JLabel label1;
    JButton compute;

    public MyGUI(String[] stateList){
        super("Tax Calculator");
        this.stateList = stateList;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

        Container con = this.getContentPane();
        con.setLayout(null);
        //setLayout(new FlowLayout());
        label1 = new JLabel("Please select a state: ");
        compute = new JButton("Compute Tax");
        //add(label1);

        JComboBox myJComb = new JComboBox(stateList);
        //JList jList = new JList(stateList);
        //JScrollPane jsPane = new JScrollPane(jList);

        JPanel jp1 = new JPanel();
        jp1.add(myJComb);
        con.add(label1);
        //con.add(BorderLayout.WEST, jsPane);
        //con.add(BorderLayout.EAST, jp1);

        jp1.setBounds(50, 50, 300, 200);
    }
}
