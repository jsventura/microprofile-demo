package pe.com.interscope.customer.loan.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import pe.com.interscope.customer.loan.client.model.Customer;

@RegisterRestClient
@ApplicationScoped
public interface CustomerService {

  @GET
  List<Customer> getAllCustomers();

}
