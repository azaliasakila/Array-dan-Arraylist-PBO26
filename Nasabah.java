public class Nasabah {
    private String firstname, lastname;
    private Account acc;

    public Nasabah(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAccount(Account account) {
        this.acc = account;
    }

    public Account getAccount() {
        return acc;
    }
}