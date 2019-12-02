public class Airplaine {
    private boolean autoPilot;
    private AirplaneColor airplaneColor;


    private void autoPilotONOFF(String onOrOff){
       autoPilot = onOrOff.equals("ON");
    }

    public Airplaine(AirplaneColor color){
        airplaneColor = color;

    }

    abstract  class Position{
        private int position;

        void setPosition(int position) {
            this.position = (position>=1 && position<=4) ? position : 1;
        }

        public int getPosition() {
            return position;
        }

        abstract public void changPosition(int position);

    }

    class Ailerons extends Position{
        private AirplaneColor color = airplaneColor;


        @Override
        public void changPosition(int position) {
            autoPilotONOFF("ON");
            setPosition(position);
        }
    }

    class Elevators extends Position{
        private AirplaneColor color = airplaneColor;

        @Override
        public void changPosition(int position) {
            autoPilotONOFF("ON");
            setPosition(position);
        }
    }

    static class Engine{
        private boolean engineActivation;

        public void engineOn(){
            engineActivation=true;
            System.out.println("Engine ON");
        }

        public  void engineOFF(){
            engineActivation=false;
            System.out.println("Engine OFF");
        }
    }

}
