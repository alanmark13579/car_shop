package carshop;

public class Shop {
    private int money = 0; //售車收入

    public void sellCar(Car car) {  //賣出一部車
        System.out.println("車型："  + car.getName()   +" 單價："  + car.getPrice());
        money  = money+car.getPrice();  //增加賣出車售價的收入
    }
    public void searchCar(Car car) {  //賣出一部車
        System.out.println("車型："  + car.getName()  + " 單價："  + car.getPrice()+
                " 駕駛座位置：" + car.drive_position()+" 導航型號:" +car.Navigation_name()
                +" 冷氣型號:" +car.Air_conditioner_name());
    }
    //售車總收入
    public int getMoney() {
        return money;
    }
    public static void main(String[] args) {
        Shop Shop = new Shop();
        Shop.sellCar(new BMW());
        Shop.searchCar(new BMW()) ;
        Shop.sellCar(new TOYOTA());
        Shop.searchCar(new TOYOTA());
        System.out.println("總收入："  + Shop.getMoney());
    }
}


