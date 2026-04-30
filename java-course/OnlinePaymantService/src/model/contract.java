package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import service.OnlinePaymentService;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> installments;

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = new ArrayList<>();
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }

    // Método que gera as parcelas
    public void generateInstallments(int months, OnlinePaymentService paymentService) {
        double basicQuota = totalValue / months;

        for (int i = 1; i <= months; i++) {
            // Data: mês após a data do contrato
            LocalDate dueDate = date.plusMonths(i);

            // Cálculos
            double interest = paymentService.interest(basicQuota, i);
            double fee = paymentService.paymentFee(basicQuota + interest);
            double totalInstallment = basicQuota + interest + fee;

            // Cria e adiciona a parcela
            addInstallment(new Installment(dueDate, totalInstallment));
        }
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public Integer getNumber() {
        return number;
    }
}