package com.company;

public class Main {
  public static void main(String[] args) {
      int l = 10;
      int ll = 11;
      test();
      test1("Алексей");
      System.out.println(test2(l));
      System.out.println((test3(l,ll)));

    Cats a = new Cats("Vasya", "1997");
    System.out.println(a.animals());

    Dogs b = new Dogs ("Marsik", "1998");
    System.out.println(b.animals1());

    Chiken g = new Chiken ("Masha", "1997", "Yelow");
    System.out.println(g.animals2());
  }

  public static void test () {
      System.out.println("Testing!");
  }

  public static void test1(String m ) {
    System.out.println("hello "+ m );
  }

  public static int test2 (int s) {
      return s*s;
  }

  public static int test3(int a, int b) {
      return a*b;
  }
}
