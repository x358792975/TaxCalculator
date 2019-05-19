import java.util.HashMap;

public class TaxCalculator {

    public static void main(String[] args) {

        HashMap<String, Double> stateTax = new HashMap<>();
        stateTax.put("Alabama",9.14);
        stateTax.put("Alaska",1.43);
        stateTax.put("Arizona",8.37);
        stateTax.put("Arkansas",9.43);
        stateTax.put("California",8.56);
        stateTax.put("Colorado",7.63);
        stateTax.put("Connecticut",6.35);
        stateTax.put("Delaware",0.00);
        stateTax.put("Florida",7.05);
        stateTax.put("Georgia",7.29);
        stateTax.put("Hawaii",4.41);
        stateTax.put("Idaho",6.03);
        stateTax.put("Illinois",8.74);
        stateTax.put("Indiana",7.00);
        stateTax.put("Iowa",6.82);
        stateTax.put("Kansas",8.67);
        stateTax.put("Kentucky",6.00);
        stateTax.put("Louisiana",9.45);
        stateTax.put("Maine",5.50);
        stateTax.put("Maryland",6.00);
        stateTax.put("Massachusetts",6.25);
        stateTax.put("Michigan",6.00);
        stateTax.put("Minnesota",7.43);
        stateTax.put("Mississippi",7.07);
        stateTax.put("Missouri",8.13);
        stateTax.put("Montana",0.00);
        stateTax.put("Nebraska",6.85);
        stateTax.put("Nevada",8.14);
        stateTax.put("New Hampshire",0.00);
        stateTax.put("New Jersey",6.60);
        stateTax.put("New Mexico",7.82);
        stateTax.put("New York",8.49);
        stateTax.put("North Carolina",6.97);
        stateTax.put("North Dakota",6.85);
        stateTax.put("Ohio",7.17);
        stateTax.put("Oklahoma",8.92);
        stateTax.put("Oregon",0.00);
        stateTax.put("Pennsylvania",6.34);
        stateTax.put("Rhode Island",7.00);
        stateTax.put("South Carolina",7.43);
        stateTax.put("South Dakota",6.40);
        stateTax.put("Tennessee",9.47);
        stateTax.put("Texas",8.19);
        stateTax.put("Utah",6.94);
        stateTax.put("Vermont",6.18);
        stateTax.put("Virginia",5.65);
        stateTax.put("Washington",9.17);
        stateTax.put("West Virginia",6.39);
        stateTax.put("Wisconsin",5.44);
        stateTax.put("Wyoming",5.36);
        stateTax.put("DC", 6.00);

        HashMap<String, Double> currencyRate = new HashMap<>();
        currencyRate.put("China", 6.92);
        currencyRate.put("Korea",1194.74);
        currencyRate.put("Canada", 1.34);
        currencyRate.put("Australian", 1.45);
        currencyRate.put("Japan", 110.10);
        currencyRate.put("British", 0.79);

        MyGUI gui = new MyGUI();
        gui.initialUI(stateTax, currencyRate);
    }
}
