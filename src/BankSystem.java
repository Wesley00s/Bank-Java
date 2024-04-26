package src;

public class BankSystem {
    private Integer number;
    private String agency;
    private String clientName;
    private Double balance;

    public BankSystem(Integer number, String agency, String clientName, Double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String showMessage() {
        return "\n-----------------------------------------------------------------------------------------------\n" +
                "Hello " + clientName + ", thanks for creating your account with us, your agency is " + agency + " account " + number + " and your available balance is U$" + balance;
    }
}
