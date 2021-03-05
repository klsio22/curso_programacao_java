package ex_01;

public class produtos {
    private String product;
    private int age , code;
    private char gender;
    private  double price , measure;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public double getMeasure() {
        return measure;
    }

    public double getPrice() {
        return price;
    }

    public char getGender() {
        return gender;
    }

    public int getCode() {
        return code;
    }

    public int getAge() {
        return age;
    }

    public String getProduct() {
        return product;
    }


}
