import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaceGuide {
    Scanner sc = new Scanner(System.in);

    public void getInfo() {
        RaceInfo ri = new RaceInfo(getCars(), getTryNum());
    }

    private List<RacingCar> getCars() {
        System.out.println("경주할 자동차 이름을 입력해주세요.");
        System.out.println("쉼표(,)로 구분해서 입력해주세요.");
        System.out.println("ex) neo,brie,brown");
        System.out.println("입력 : ");

        return elaborateString(sc.nextLine());
    }

    private List<RacingCar> elaborateString(String str) {
        List<RacingCar> cars = new ArrayList<>();
        for(var carName : str.split(",")) cars.add(new RacingCar(carName));

        return cars;
    }

    private int getTryNum() {
        sc.nextLine();
        System.out.println("시도할 횟수를 입력해주세요.");
        System.out.println("입력 : ");

        return sc.nextInt();
    }

}
