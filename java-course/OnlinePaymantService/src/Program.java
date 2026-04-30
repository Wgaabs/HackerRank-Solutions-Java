import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.Contract;
import service.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Numero: ");
        Integer number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), formatter);

        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();

        // Cria o contrato
        Contract contract = new Contract(number, date, totalValue);

        // Gera as parcelas usando PaypalService
        contract.generateInstallments(months, new PaypalService());

        // Mostra as parcelas
        System.out.println("Parcelas:");
        for (var installment : contract.getInstallments()) {
            System.out.printf("%s - %.2f%n",
                    installment.getDueDate().format(formatter),
                    installment.getAmount());
        }

        sc.close();
    }
}