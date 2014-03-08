package no.skotsj.j8.core;

public class PersonBuilder
{
  private String givenName;
  private String surName;
  private int age;
  private Person.Gender gender;
  private String eMail;
  private String phone;
  private String address;

  public PersonBuilder setGivenName(String givenName)
  {
    this.givenName = givenName;
    return this;
  }

  public PersonBuilder setSurName(String surName)
  {
    this.surName = surName;
    return this;
  }

  public PersonBuilder setAge(int age)
  {
    this.age = age;
    return this;
  }

  public PersonBuilder setGender(Person.Gender gender)
  {
    this.gender = gender;
    return this;
  }

  public PersonBuilder seteMail(String eMail)
  {
    this.eMail = eMail;
    return this;
  }

  public PersonBuilder setPhone(String phone)
  {
    this.phone = phone;
    return this;
  }

  public PersonBuilder setAddress(String address)
  {
    this.address = address;
    return this;
  }

  public Person createPerson()
  {
    return new Person(givenName, surName, age, gender, eMail, phone, address);
  }
}
