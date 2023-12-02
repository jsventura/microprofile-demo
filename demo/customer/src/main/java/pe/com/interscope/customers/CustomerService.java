package pe.com.interscope.customers;

import java.util.Arrays;
import java.util.List;

public class CustomerService {

  List<Customer> customers = Arrays.asList(
      new Customer("42897521","Jose", "Ventura", 38),
      new Customer("42897522","Carlos", "Perez", 50),
      new Customer("42897523","Miguel", "Cueva", 60)
  );
  public List<Customer> getAll() {
    return customers;
  }
}
