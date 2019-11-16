public class StateExample{

    public static void main(String[] args) throws Exception {
        System.out.println("State example");
        Light light = new Light();

        light.on();

        light.off();

        light.off();

        light.on();

        light.destroy();

        light.off();
    }
}


