import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions;

public class RacingCarTest {
    RacingCar rc = new RacingCar("rcCar");

    @Test
    void 자동차_테스트() {

        rc.move(5);
        Assertions.assertThat(rc.getLocation()).isEqualTo(1);
        rc.move(4);
        Assertions.assertThat(rc.getLocation()).isEqualTo(2);
        rc.move(1);
        Assertions.assertThat(rc.getLocation()).isEqualTo(2);
        rc.move(9);
        Assertions.assertThat(rc.getLocation()).isEqualTo(3);
    }

    @Test
    void judgeMoving_테스트() {

        Assertions.assertThat(rc.judgeMoving(3)).isEqualTo(false);
        Assertions.assertThat(rc.judgeMoving(4)).isEqualTo(true);
        Assertions.assertThat(rc.judgeMoving(0)).isEqualTo(false);
        Assertions.assertThat(rc.judgeMoving(9)).isEqualTo(true);
        Assertions.assertThat(rc.judgeMoving(5)).isEqualTo(true);
    }

}
