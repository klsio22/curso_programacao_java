package ex_01;

import java.util.Locale;

public class main {
    public static void main(String[] args) {

        produtos product1 = new produtos();
        produtos product2 = new produtos();

        produtos age1 = new produtos();
        produtos code01 = new produtos();
        produtos gender = new produtos();

        produtos price01 = new produtos();
        produtos price02 = new produtos();
        produtos measure = new produtos();

        product1.setProduct("Computer");
        product2.setProduct("Office desk");

        age1.setAge(30);
        code01.setCode(5230);
        gender.setGender('F');

        price01.setPrice(2100.00);
        price02.setPrice(650.50);

        measure.setMeasure(53.234567);

        slnf.Println("Products:");

        slnf.Printf("%s , which price is $%.2f\n",
                product1.getProduct() , price01.getPrice());

        slnf.Printf("%s , which price is $%.2f\n\n",
                product2.getProduct() , price02.getPrice());

        slnf.Printf("Record: %d years d , code %d and %s\n\n",
                age1.getAge(), code01.getCode(),gender.getGender());

        slnf.Printf("Measuare with eight decimal places : %.8f\n",
                measure.getMeasure());

        slnf.Printf("Rouded(three decimal places): %.3f\n", measure.getMeasure());

        Locale.setDefault(Locale.US);

        slnf.Printf("US decimal point: %.3f",measure.getMeasure());

    }
}

class slnf {

    public static void Println(String s){
        System.out.println(s);
    }

    public static void Printf(String s, double x){
        System.out.printf(s , x);
    }
    public static void Printf(String s, String n, double x) {
        System.out.printf(s,n,x);
    }

    public static void Printf(String s, int n, int i, char g ) {
        System.out.printf(s,n,i,g );
    }
}

