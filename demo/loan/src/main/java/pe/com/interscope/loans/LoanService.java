package pe.com.interscope.loans;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoanService {

  List<Loan> loans = Arrays.asList(
    new Loan(1L, "42897521", "Prestamo personal", 1500.0, 500.0, LocalDate.of(2023,2, 15)),
    new Loan(2L, "42897522", "Prestamo personal", 5000.0, 1000.0, LocalDate.of(2023,6, 1)),
    new Loan(3L, "42897523", "Prestamo personal", 2000.0, 900.0, LocalDate.of(2023,1, 10)),
    new Loan(4L, "42897524", "Prestamo personal", 3500.0, 0.0, LocalDate.of(2023,8, 20))

  );

  public List<Loan> getLoansByDocumentNumber(String documentNumber) {
    return loans.stream()
        .filter(l -> l.getDocumentNumber().equals(documentNumber))
        .collect(Collectors.toList());
  }
}
