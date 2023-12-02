package pe.com.interscope.loans;

import java.time.LocalDate;

public class Loan {

  private Long loanId;
  private String documentNumber;
  private String loanDescription;
  private Double loanAmount;
  private Double loanRemaining;
  private LocalDate loanCreated;

  public Loan(Long loanId, String documentNumber, String loanDescription, Double loanAmount,
      Double loanRemaining, LocalDate loanCreated) {
    this.loanId = loanId;
    this.documentNumber = documentNumber;
    this.loanDescription = loanDescription;
    this.loanAmount = loanAmount;
    this.loanRemaining = loanRemaining;
    this.loanCreated = loanCreated;
  }

  public Long getLoanId() {
    return loanId;
  }

  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getLoanDescription() {
    return loanDescription;
  }

  public void setLoanDescription(String loanDescription) {
    this.loanDescription = loanDescription;
  }

  public Double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(Double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public Double getLoanRemaining() {
    return loanRemaining;
  }

  public void setLoanRemaining(Double loanRemaining) {
    this.loanRemaining = loanRemaining;
  }

  public LocalDate getLoanCreated() {
    return loanCreated;
  }

  public void setLoanCreated(LocalDate loanCreated) {
    this.loanCreated = loanCreated;
  }
}
