import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions;

public class RacingCarTest {

    @Test
    void 자동차_테스트() {
        RacingCar rc = new RacingCar("rcCar");

        rc.move(5);
        Assertions.assertThat(rc.getLocation()).isEqualTo(1);
        rc.move(4);
        Assertions.assertThat(rc.getLocation()).isEqualTo(2);
        rc.move(1);
        Assertions.assertThat(rc.getLocation()).isEqualTo(2);
        rc.move(9);
        Assertions.assertThat(rc.getLocation()).isEqualTo(3);
    }
}
