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

    public void move(int n) { // 테스트용 메소드
        if(judgeMoving(n)) ++location;
    };

    private int makeRandNum() {
        Random random = new Random();
        return random.nextInt(10);
    }

    private boolean judgeMoving() {
        if(makeRandNum() >= 4) return true;
        return false;
    }

    public boolean judgeMoving(int n) { /// 테스트용 메소드
        if(n >= 4) return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }
}
