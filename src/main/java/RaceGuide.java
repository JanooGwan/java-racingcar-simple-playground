import Exceptions.TooLongNameException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaceGuide {
    Scanner sc = new Scanner(System.in);

    public RaceInfo getInfo() {
        return new RaceInfo(getCars(), getTryNum());
    }

    private List<RacingCar> getCars() {
        System.out.println("경주할 자동차 이름을 입력해주세요.");
        System.out.println("쉼표(,)로 구분해서 입력해주세요. ex) neo,brie,brown");
        System.out.print("입력 : ");

        return elaborateString(sc.nextLine());
    }

    private List<RacingCar> elaborateString(String str) {
        List<RacingCar> cars = new ArrayList<>();
        for(var carName : str.split(",")) {
            if(carName.isEmpty()) throw new TooLongNameException("비어있는 이름이 있습니다.");
            if(carName.length() > 5) throw new TooLongNameException("이름은 5자 이하여야 합니다.");

            cars.add(new RacingCar(carName));
        }

        return cars;
    }

    private int getTryNum() {
        System.out.println("시도할 횟수를 입력해주세요.");
        System.out.print("입력 : ");

        int input;

        try {
            input = sc.nextInt();
        }
        catch (Exception e) {
            throw new IllegalArgumentException("숫자만 입력받을 수 있습니다.");
        }

        return input;
    }

    public void printRaceStatus(List<RacingCar> cars, int tryNum) {
        if(tryNum == 1) {
            System.out.println("< 실행 결과 >");
        }

        System.out.print('\n');

        for(var c : cars) {
            System.out.println(c.getName() + " : " + "-".repeat(c.getLocation()));
        }
    }

    public void printWinners(List<String> cars) {
        System.out.print('\n');
        System.out.println("우승자는 " + String.join(", ", cars) + " 입니다.");
    }
}
