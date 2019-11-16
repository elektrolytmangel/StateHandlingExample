public class Light {

    private LightState state;

    public Light(){
        this.state = new LightOff();
    }

    public void on() throws Exception{

        if (this.state != null){
            this.state = this.state.on();
        }
        else {
            throw new Exception("cannot turn on light, if already destroyed");
        }
    }

    public void off() throws Exception{
        if (this.state != null){
            this.state = this.state.off();
        }
        else{
            throw new Exception("cannot turn on light, if already destroyed");
        }
    }

    public void destroy() throws Exception{

        if (this.state != null){
            this.state = this.state.destroy();
        }
        else{
            throw new Exception("cannot destroy light, if already destroyed.");
        }
    }
}
