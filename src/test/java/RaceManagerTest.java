import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaceManagerTest {
    @Test
    void 레이스_매니저_테스트_랜덤() {
        RaceManager rm = new RaceManager();

        rm.joinRacingCar("carA");
        rm.joinRacingCar("carB");
        rm.joinRacingCar("carC");

        rm.readyRace();

        System.out.print("우승자 : ");
        System.out.println(rm.findWinners());
    }
}
