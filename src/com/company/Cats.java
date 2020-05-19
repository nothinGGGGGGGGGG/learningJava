package com.company;

public class Cats {
  String name;
  String year;

public Cats (String a, String b) {
  name = a;
  year = b;
}
  public String animals() {
    return this.name + " " +  this.year;
  }
}
