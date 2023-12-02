package pe.com.interscope.customer.loan;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import pe.com.interscope.customer.loan.client.CustomerService;
import pe.com.interscope.customer.loan.client.LoanService;
import pe.com.interscope.customer.loan.client.model.Loan;

@Path("/customer-loans")
@Produces("application/json")
@Consumes("application/json")
@ApplicationScoped
public class CustomerLoanController {

  @Inject
  @RestClient
  private CustomerService customerService;

  @Inject
  @RestClient
  private LoanService loanService;

  @GET
  public List<CustomerLoan> getCustomerLoans(){

    return customerService.getAllCustomers()
        .stream()
        .map(customer -> {
          List<Loan> loans = loanService.getLoansByDocumentNumber(
              customer.getDocumentNumber());
          return new CustomerLoan(customer, loans);
        }).collect(Collectors.toList());
  }

}
