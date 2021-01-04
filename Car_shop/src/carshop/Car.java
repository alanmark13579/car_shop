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