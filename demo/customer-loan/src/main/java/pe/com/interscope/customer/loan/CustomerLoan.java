package pe.com.interscope.customer.loan;

import java.util.List;
import pe.com.interscope.customer.loan.client.model.Customer;
import pe.com.interscope.customer.loan.client.model.Loan;

public class CustomerLoan {

  private Customer customer;
  private List<Loan> loans;

  public CustomerLoan(Customer customer, List<Loan> loans) {
    this.customer = customer;
    this.loans = loans;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public List<Loan> getLoans() {
    return loans;
  }

  public void setLoans(List<Loan> loans) {
    this.loans = loans;
  }
}
