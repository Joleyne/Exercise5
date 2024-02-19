public class AddressBook {
    private String email;

    public AddressBook(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "email='" + email + '\'' +
                '}';
    }

    public void display(Person a) {
        System.out.println(a.getName()+"'s email is : "+this.getEmail());
    }
}
