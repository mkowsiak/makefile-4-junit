package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  @DisplayName("2 + 2 = 4")
  void twoPlusTwoEqualsFour() {
    Main m = new Main();
    assertEquals(4, m.add(2,2), "Something went wrong!");
  }

}

