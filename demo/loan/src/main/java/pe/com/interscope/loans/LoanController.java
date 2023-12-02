package pe.com.interscope.loans;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import java.util.List;

@Path("/loans")
@Produces("application/json")
@Consumes("application/json")
@ApplicationScoped
public class LoanController {

  @Inject
  private LoanService loanService;

  @GET
  @Path("{documentNumber}")
  public List<Loan> getLoansByDocumentNumber(@PathParam("documentNumber") String documentNumber){
    return loanService.getLoansByDocumentNumber(documentNumber);
  }

}
