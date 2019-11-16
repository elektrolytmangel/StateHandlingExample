public class LightOn extends LightState {

    @Override
    public LightState off(){
        System.out.println("Turn off the light");
        return new LightOff();
    }
}
