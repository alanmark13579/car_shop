package carshop;

abstract public class Car implements Navigation,AirConditioner {

    abstract public String getName();   //汽車名稱
    abstract public int getPrice() ;  //獲得汽車售價
    abstract public String drivePosition();//駕駛座位置
    abstract public String carType();
}

interface Navigation {//引擎製造商
    String navigationName() ;
}
interface AirConditioner {//冷氣製造商
    String airConditionerName() ;
}
class Bmw extends Car  { //BMW車體細節
    int price = 300000;

    @Override
    public String navigationName(){
        return "NAV_TW" ;
    }
    @Override
    public String airConditionerName(){
        return "AIR_TW" ;
    }
    @Override
    public String getName() {
        return "BMW";
    }
    @Override
    public int getPrice() { return price; }
    @Override
    public String drivePosition(){ return "Right" ; }
    @Override
    public String carType(){return "轎車" ;} ;
}
class Toyota extends Car { //Toyota車體細節
    int price =200000;
    @Override
    public String navigationName(){
        return "NAV_JP" ;
    }
    @Override
    public String airConditionerName(){ return "AIR_JP" ; }
    @Override
    public String getName() {
        return "TOYOTA";
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String drivePosition(){
        return "Left" ;
    }
    @Override
    public String carType(){return "休旅車" ;} ;
}