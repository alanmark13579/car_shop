package carshop;

public class Shop {
    private int money = 0; //售車收入

    public void sellCar(Car car) {  //賣出一部車
        System.out.println("車型："  + car.getName()   +" 單價："  + car.getPrice());
        money  = money+car.getPrice();  //增加賣出車售價的收入
    }
    public void searchCar(Car car) {  //賣出一部車
        System.out.println("車型："  + car.getName()  + " 單價："  + car.getPrice()+
                " 駕駛座位置：" + car.drivePosition()+" 導航型號:" +car.navigationName()
                +" 冷氣型號:" +car.airConditionerName());
    }
    //售車總收入
    public int getMoney() {
        return money;
    }
    public static void main(String[] args) {
        Shop Shop = new Shop();
        Shop.sellCar(new Bmw());
        Shop.searchCar(new Bmw()) ;
        Shop.sellCar(new Toyota());
        Shop.searchCar(new Toyota());
        System.out.println("總收入："  + Shop.getMoney());
    }
}


