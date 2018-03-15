package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point d = new Point(4, 1,5, 1);
    Assert.assertEquals(d.distance(), 5.0 );
  }

  @Test
  public void testDistanceFail() {
    Point d = new Point(5, 1,5, 1);
    assert d.distance() != 25;
  }
}
