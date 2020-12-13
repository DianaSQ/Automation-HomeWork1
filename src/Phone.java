//Описать класс Phone. Реализуйте метод который будет возвращать стоимость и производителя телефона.

public class Phone {
    String companyName;
    int price;

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public static void main(String[] args) {
        Phone tel = new Phone();
        tel.setPrice(200);
        tel.setCompanyName("iPhone");

//       System.out.println(tel.setPrice);
        //      System.out.println(tel.setCompanyName);
    }
}
