import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class RaceManager {
    List<RacingCar> raceMembers = new ArrayList<>();

    public void joinRacingCar(String carName) {
        raceMembers.add(new RacingCar(carName));
    }

    public void raceStart(int moveNum) {
        progressRacing(moveNum);
    }

    private void progressRacing(int moveNum) {
        for(int i = 0; i < moveNum; ++i) {
            for(var car : raceMembers) car.move();
        }
    }

    public List<String> findWinners() {
        List<String> winners = new ArrayList<>();
        int maxLocation = searchMaxLocation();

        for(var car : raceMembers) {
            if(maxLocation == car.getLocation()) winners.add(car.getName());
        }

        return winners;
    }

    private int searchMaxLocation() {
        int maxLocation = 0;

        for(var car : raceMembers) {
            maxLocation = Math.max(maxLocation, car.getLocation());
        }

        return maxLocation;
    }
}
