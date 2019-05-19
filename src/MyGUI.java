import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyGUI extends JFrame {

    HashMap<String, Double> stateTax;
    HashMap<String, Double> currencyRate;
    JLabel label1, label2, label3, label4, label5;
    JButton compute, btnCurrency;
    JComboBox<String> statesBox, countryBox;
    double amount,currencyResult, total;
    JPanel panel;
    JTextField txt;
    String selectedState, selectedCountry;
    TextArea taTax, taExchange;
    DecimalFormat df = new DecimalFormat("#.00");

    public MyGUI(){
        super("Tax Calculator");

    }
    public void initialUI(HashMap<String, Double> stateTax, HashMap<String, Double> currencyRate){


        this.stateTax = stateTax;
        this.currencyRate = currencyRate;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        setLayout(flowLayout);
        flowLayout.setHgap(60);
        flowLayout.setVgap(30);
        panel = new JPanel();
        JFrame f = new JFrame();
        f.add(panel);
        label1 = new JLabel();

        //label1.setForeground(Color.red);
        label1.setText("Please Select a State:                   ");

        panel.add(label1);

        this.add(panel);
        label2 = new JLabel();
        label2.setText("Please enter the amount of money:           ");
        this.add(label2);

        label3 = new JLabel("Click button to compute :                              ");

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                // TODO Auto-generated method stub
                if(ItemEvent.SELECTED == arg0.getStateChange()){
                    String selectedItem = arg0.getItem().toString();
                    selectedState = selectedItem;
                }
                if(ItemEvent.DESELECTED == arg0.getStateChange()){
                    String selectedItem = arg0.getItem().toString();
                }
            }
        };


        statesBox = new JComboBox<>();
        statesBox.setEditable(true);
        statesBox.addItemListener(itemListener);
        Iterator iterator = stateTax.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry current = (Map.Entry) iterator.next();
            statesBox.addItem(current.getKey().toString());
        }
        statesBox.setEditable(false);
        panel.add(statesBox);

        add(label2);

        txt = new JTextField(8);
        taTax = new TextArea(2,50);


        add(txt);
        add(label3);
        compute = new JButton("Compute Tax");
        compute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amount = Integer.parseInt(txt.getText());
                double taxRate = (stateTax.get(selectedState))/100;
                total = (amount * (1+ taxRate ));
                taTax.setText("Final Amount: " + df.format(total));
                System.out.println("Amount :  " + amount);
                System.out.println("total  " + total);
            }
        });


        add(compute);
        taTax.setEditable(false);
        add(taTax);

        label4 = new JLabel("Please select a country:                       ");
        add(label4);

        ItemListener countryListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                // TODO Auto-generated method stub
                if(ItemEvent.SELECTED == arg0.getStateChange()){
                    String selectedItem = arg0.getItem().toString();
                    selectedCountry = selectedItem;
                }
                if(ItemEvent.DESELECTED == arg0.getStateChange()){
                    String selectedItem = arg0.getItem().toString();
                }
            }
        };

        countryBox = new JComboBox<>();
        countryBox.setEditable(true);
        countryBox.addItemListener(countryListener);
        Iterator iterator2 = currencyRate.entrySet().iterator();
        while(iterator2.hasNext()){
            Map.Entry current = (Map.Entry) iterator2.next();
            countryBox.addItem(current.getKey().toString());
        }
        countryBox.setEditable(false);

        add(countryBox);

        label5 = new JLabel("Click button to compute foreign currency exchange: ");
        add(label5);

        btnCurrency = new JButton("Compute Currency Exchange: " );
        btnCurrency.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double curRate = currencyRate.get(selectedCountry);
                System.out.println(curRate);
                currencyResult = total * curRate;
                taExchange.setText(df.format(currencyResult));
            }
        });
        add(btnCurrency);

        taExchange = new TextArea(2,50);
        add(taExchange);

        taExchange.setEditable(false);

        this.setSize(500, 600);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
