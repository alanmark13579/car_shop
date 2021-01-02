package car_shop;

import com.thoughtworks.xstream.mapper.Mapper;

public class Car_shop {
    private int money = 0; //售車收入

    public void sellCar(Car car) {  //賣出一部車
        System.out.println("車型："  + car.getName()   +" 單價："  + car.getPrice());
        money  = money+car.getPrice();  //增加賣出車售價的收入
    }
    public void sreachCar(Car car) {  //賣出一部車
        System.out.println("車型："  + car.getName()  + " 單價："  + car.getPrice()+
                " 駕駛座位置：" + car.drive_position()+" 導航型號:" +car.Navigation_name()
                +" 冷氣型號:" +car.Air_conditioner_name());
    }
    //售車總收入
    public int getMoney() {
        return money;
    }
    public static void main(String[] args) {
        Car_shop Shop = new Car_shop();
        Shop.sellCar(new BMW());
        Shop.sreachCar(new BMW()) ;
        Shop.sellCar(new TOYOTA());
        Shop.sreachCar(new TOYOTA());
        System.out.println("總收入："  + Shop.getMoney());
    }
}

//汽車介面
abstract class Car implements Navigation,Air_conditioner { //方向盤 輪子

    public String getName()   //汽車名稱
    {
        return "" ;
    }
    public int getPrice()   //獲得汽車售價
    {
        return 0;
    }
    public String drive_position(){
        return "" ;
    }
}
interface Navigation {
    String Navigation_name() ;
}
interface Air_conditioner {
    String Air_conditioner_name() ;
}

//寶馬
class BMW extends Car  {

    public String Navigation_name(){
        return "NAV_TW" ;
    }
    public String Air_conditioner_name(){
        return "AIR_TW" ;
    }
    public String getName() {
        return "BMW";
    }
    public int getPrice() {
        return 300000;
    }
    public String drive_position(){
        return "Right" ;
    }
}
class TOYOTA extends Car {
    public String Navigation_name(){
        return "NAV_JP" ;
    }
    public String Air_conditioner_name(){
        return "AIR_JP" ;
    }
    public String getName() {
        return "TOYOTA";
    }
    public int getPrice() {
        return 200000;
    }
    public String drive_position(){
        return "Left" ;
    }
}


