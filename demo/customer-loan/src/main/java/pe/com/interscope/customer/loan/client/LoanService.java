package pe.com.interscope.customer.loan.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import pe.com.interscope.customer.loan.client.model.Loan;

@RegisterRestClient
@ApplicationScoped
public interface LoanService {

  @GET
  @Path("/{documentNumber}")
  List<Loan> getLoansByDocumentNumber(@PathParam("documentNumber") String documentNumber);

}
