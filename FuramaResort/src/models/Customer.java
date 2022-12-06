package models;

public class Customer extends Person{
    protected String customersCode;
    protected String myAddress;
    protected String customerType;

    public Customer(){}

    public Customer(String customersCode, String myAddress, String customerType) {
        this.customersCode = customersCode;
        this.myAddress = myAddress;
        this.customerType = customerType;
    }

    public Customer(String fullName, int dateOfBirth, int phoneNumber, String numId, String sex, String eMail, String customersCode, String myAddress, String customerType) {
        super(fullName, dateOfBirth, phoneNumber, numId, sex, eMail);
        this.customersCode = customersCode;
        this.myAddress = myAddress;
        this.customerType = customerType;
    }
}
