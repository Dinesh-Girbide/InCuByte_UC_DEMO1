package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher implements Comparable<Integer> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  private Integer id;
  private String name;

  public Teacher() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int compareTo(Integer anotherInteger) {
    return id.compareTo(anotherInteger);
  }
}
