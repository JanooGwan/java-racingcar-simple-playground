import java.util.Scanner;

public class RaceGuide {
    Scanner sc = new Scanner(System.in);

    public void getInfo() {
        getCarString();
        getTryNum();
        sendInfo();
    }

    private void getCarString() {
        System.out.println("경주할 자동차 이름을 입력해주세요.");
        System.out.println("쉼표(,)로 구분해서 입력해주세요.");
        System.out.println("ex) neo,brie,brown\n");
        System.out.println("입력 : ");
        elaborateString(sc.nextLine());
    }

    private void elaborateString(String str) {

    }

    private void getTryNum() {
        sc.nextLine();
        System.out.println("시도할 횟수를 입력해주세요.");
        System.out.println("입력 : ");
    }

    private void sendInfo() {

    }
}
