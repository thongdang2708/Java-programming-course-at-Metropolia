public class ClientRegister {
    public static void main(String args[]) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4");

        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);

        System.out.println(client2);
        System.out.println(client3);
    }
}

class Client {

    private String typeCustomer;
    private String id;
    private String roadName;

    Client(String typeCustomer, String id, String roadName) {
        this.typeCustomer = typeCustomer;
        this.id = id;
        this.roadName = roadName;
    }

    String getName() {
        return this.typeCustomer;
    }

    String getId() {
        return this.id;
    }

    String getRoadName() {
        return this.roadName;
    }

}

class AccountClient extends Client {

    private double amountMoney;

    AccountClient(String customerName, String id, String roadName) {
        super(customerName, id, roadName);
    }

    AccountClient(String customerName, String id) {
        super(customerName, id, "");
    }

    void deposit(double amount) {
        this.amountMoney += amount;
    }

    void withdraw(double amount) {
        this.amountMoney -= amount;
    }

    public String toString() {
        return super.getName() + "(" + super.getId() + "): " + this.amountMoney;
    }
}

class CashClient extends Client {

    private double cash;

    CashClient(String customerName, String id) {
        super(customerName, id, "");
    }

    void payCash(double amount) {
        this.cash += amount;
        int convert = (int) this.cash;
        System.out.println(super.getName() + "(" + super.getId() + "): Amount paid " + convert + " euros.");
    }

    public String toString() {
        return super.getName() + "(" + super.getId() + "): Amount paid " + cash + " euros.";
    }

}
