public class LightOff extends LightState {

    @Override
    public LightState on(){
        System.out.println("Turn on the light");
        return new LightOn();
    }
}
