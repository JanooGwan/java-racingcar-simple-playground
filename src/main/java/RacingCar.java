import java.util.Random;

public class RacingCar implements Moveable {
    String name;
    int location;


    public RacingCar(String name) {
        this.name = name;
        this.location = 0;
    }

    public void move() {
        if(judgeMoving()) ++location;
    };

    private boolean judgeMoving() {
        Random random = new Random();
        int randNum = random.nextInt(10);

        if(randNum >= 4) return true;
        return false;
    }

}
