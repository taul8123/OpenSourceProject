public class Automobile extends Car {
    int seatNum;

    int getSetNum(){
        return seatNum;
    }

    void upSpeed(int value){
        if(speed + value >= 300){
            speed = 300;
        }
        else{
            speed = speed + (int) value;
        }
    }
}
