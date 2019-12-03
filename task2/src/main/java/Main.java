import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Airplaine airplaine = new Airplaine(AirplaneColor.Black);
            Airplaine.Ailerons ailerons = airplaine.new Ailerons();
            Airplaine.Elevators elevators = airplaine.new Elevators();
            Airplaine.Engine engine = new Airplaine.Engine();

            AirplaneColor airplaneColor = AirplaneColor.Black;
            airplaneColor.setBurnout(0);

            int time =0;

            while(true){
                Random random = new Random();
                if(airplaine.getAirplaneColor().getBurnout()<100){
                    System.out.println("I am lil airplane i have ailerons, elevators and engine");
                    ailerons.changePosition(random.nextInt(4));
                    elevators.changePosition(random.nextInt(5));
                    time+=10;
                    airplaneColor.colorBurnout(time);
                }else{
                    System.out.println("I am lil airplane. And I burnout. Find new one");
                    engine.engineOFF();
                    break;
                }
            }
        }catch (Throwable exception){
            System.out.println("random say not today");
        }
    }
}
