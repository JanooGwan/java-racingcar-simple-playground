import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class RaceManager {
    List<RacingCar> raceMembers = new ArrayList<>();
    int tryNum;

    public void readyRace() {
        RaceGuide rg = new RaceGuide();
        RaceInfo ri = rg.getInfo(); // 레이스 가이드한테 레이스 정보(참가자, 시도 횟수)를 받아오는 것을 명령함

        raceMembers = ri.getCars();
        tryNum = ri.getTryNum();

        raceStart();
    }

    public void joinRacingCar(String carName) {
        raceMembers.add(new RacingCar(carName));
    }

    public void joinRacingCar(List<RacingCar> cars) {
        raceMembers = cars;
    }

    public void raceStart() {
        progressRacing();
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
