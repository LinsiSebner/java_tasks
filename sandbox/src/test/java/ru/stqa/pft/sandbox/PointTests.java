package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    PointDatas d = new PointDatas(2,3,4,5);
    Point xy = new Point();
    Assert.assertEquals(xy.distance(d),1.0);
  }
}
