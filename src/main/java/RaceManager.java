import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class RaceManager {
    List<RacingCar> raceMembers = new ArrayList<>();
    int tryNum;

    RaceGuide rg = new RaceGuide(); // 레이스 매니저는 레이스 가이드한테 명령할 수 있음

    public void readyRace() {
        RaceInfo ri = rg.getInfo(); // 레이스 가이드한테 레이스 정보(참가자, 시도 횟수)를 받아오는 것을 명령함

        raceMembers = ri.getCars();
        tryNum = ri.getTryNum();

        progressRacing();
        rg.printWinners(findWinners());
    }


    private void progressRacing() {
        for(int i = 1; i <= tryNum; ++i) {
            for(var car : raceMembers) car.move();

            rg.printRaceStatus(raceMembers, i);
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

    public void joinRacingCar(String carName) { // 테스트용
        raceMembers.add(new RacingCar(carName));
    }

    public void joinRacingCar(List<RacingCar> cars) { // 테스트용
        raceMembers = cars;
    }
}
