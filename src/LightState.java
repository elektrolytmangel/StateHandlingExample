public abstract class LightState {


    public LightState on(){
        return this;
    }

    public LightState off(){
        return this;
    }

    public LightState destroy(){
        System.out.println("Destroy light");
        return null;
    }

}
