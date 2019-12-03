import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;

import java.util.Random;

@ToString
@Getter
public class Airplaine {
    private boolean autoPilot;
    private AirplaneColor airplaneColor;


    private void autoPilotONOFF(String onOrOff){
       autoPilot = onOrOff.equals("ON");
        System.out.println("Auto Pilot ON");
    }

    public Airplaine(AirplaneColor color){
        airplaneColor = color;
        airplaneColor.setBurnout(0);
        airplaneColor.setColorInRGB("000000");
    }

    @Getter(AccessLevel.PROTECTED)
    abstract  class Position{
        private int position;

        void setPosition(int position) {
            this.position = (position>=1 && position<=4) ? position : 1;
            System.out.println("Position " + position);
        }

        abstract public void changePosition(int position);

    }

    class Ailerons extends Position{
        private AirplaneColor color = airplaneColor;

        @Override
        public void changePosition(int position) {
            autoPilotONOFF("ON");
            setPosition(position);
        }
    }

    class Elevators extends Position{
        private AirplaneColor color = airplaneColor;

        @Override
        public void changePosition(int position) {
            autoPilotONOFF("ON");
            setPosition(position);
        }
    }

    @Getter
    static class Engine<T>{

        private T exception;
        private boolean engineActivation;

        void engineOn(){
            engineActivation=true;
            System.out.println("Engine ON");
        }

        public  void engineOFF(){
            engineActivation=false;
            System.out.println("Engine OFF");
        }

        Engine() throws Throwable{
            Random random = new Random();
            if (random.nextBoolean()){
                System.out.println("Engine active");
                engineOn();
            }else {
                System.out.println("Engine is damaged");
                exception = (T) new Exception();
                throw (Throwable) exception;
            }
        }
    }

}
