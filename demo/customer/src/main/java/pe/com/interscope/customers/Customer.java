package pe.com.interscope.customers;

public class Customer {

  private String documentNumber;
  private String firstName;
  private String lastName;
  private Integer age;

  public Customer(String documentNumber, String firstName, String lastName, Integer age) {
    this.documentNumber = documentNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
