package com.company;

public class Chiken {
  String name;
  String year;
  String color;

  public Chiken(String name, String year, String color) {
    this.name = name;
    this.year = year;
    this.color = color;
  }

  public String animals2 () {
    return this.name + " " + this.year + " " + this.color;
  }
}
