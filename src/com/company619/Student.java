package com.company619;

public class Student extends Person {
  private int id;
  private double score;

  public Student(String name, int id) {
    this(name, 20, id, 100.0);
  }

  public Student(String name, int age, int id, double score) {
    super(name, age);
    this.id = id;
    this.score = score;
  }

  public int getId() {
    return id;
  }

  public String say() {
    return super.say() + " 学号: " + id + " 分数: " + score;
  }

}
