package no.skotsj.j8.core;

/**
 * Created by jason on 3/8/14.
 */
public class Person
{
  public String getGivenName()
  {
    return givenName;
  }

public void setGivenName(String givenName)
  {
    this.givenName = givenName;
  }

  public String getSurName()
  {
    return surName;
  }

  public void setSurName(String surName)
  {
    this.surName = surName;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public Gender getGender()
  {
    return gender;
  }

  public void setGender(Gender gender)
  {
    this.gender = gender;
  }

  public String geteMail()
  {
    return eMail;
  }

  public void seteMail(String eMail)
  {
    this.eMail = eMail;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  private String givenName;
  private String surName;
  private int age;
  private Gender gender;

  public Person(String givenName, String surName, int age, Gender gender, String eMail, String phone, String address)
  {
    this.givenName = givenName;
    this.surName = surName;
    this.age = age;
    this.gender = gender;
    this.eMail = eMail;
    this.phone = phone;
    this.address = address;
  }

  private String eMail;
  private String phone;
  private String address;


  public enum Gender
  {
    M, F
  }
}
