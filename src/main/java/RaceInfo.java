import java.util.List;

public class RaceInfo {
    private final List<RacingCar> cars;
    private final int tryNum;

    public RaceInfo(List<RacingCar> cars, int tryNum) {
        this.cars = cars;
        this.tryNum = tryNum;
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    public int getTryNum() {
        return tryNum;
    }
}
