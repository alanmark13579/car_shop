package carshop;

abstract public class Car implements Navigation,Air_conditioner { //方向盤 輪子

    abstract public String getName();   //汽車名稱
    abstract public int getPrice() ;  //獲得汽車售價
    abstract public String drive_position();
}

interface Navigation {
    String Navigation_name() ;
}
interface Air_conditioner {
    String Air_conditioner_name() ;
}
class BMW extends Car  {
    int price = 300000;

    @Override
    public String Navigation_name(){
        return "NAV_TW" ;
    }
    @Override
    public String Air_conditioner_name(){
        return "AIR_TW" ;
    }
    @Override
    public String getName() {
        return "BMW";
    }
    @Override
    public int getPrice() { return price; }
    @Override
    public String drive_position(){ return "Right" ; }
}
class TOYOTA extends Car {
    int price =200000;
    @Override
    public String Navigation_name(){
        return "NAV_JP" ;
    }
    @Override
    public String Air_conditioner_name(){ return "AIR_JP" ; }
    @Override
    public String getName() {
        return "TOYOTA";
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String drive_position(){
        return "Left" ;
    }
}