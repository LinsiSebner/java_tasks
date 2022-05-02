package ru.stqa.pft.sandbox;

public class Point {
  public static void main(String[] args) {
    PointDatas d = new PointDatas(1,5, 6,7);
    System.out.println("Дистанция= " + distance(d));
  }

  public static double distance(PointDatas d) {
    return Math.sqrt(d.x2 - d.x1) * (d.x2 - d.x1) + (d.y2 - d.y1) * (d.y2 - d.y1);
  }

}