import java.util.Random;

public class Ip {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String ip = random.nextInt(256) + "." + random.nextInt(256) + "." +
                        random.nextInt(256) + "." + random.nextInt(256);
            System.out.println("Generated IP Address: " + ip);
        }
    }
}
 
