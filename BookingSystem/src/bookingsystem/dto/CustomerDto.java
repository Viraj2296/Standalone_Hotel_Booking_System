/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dto;

/**
 *
 * @author Dell
 */
public class CustomerDto {

    private String custId;
    private String custname;
    private String custdob;
    private Double custsalary;
    private String custaddress;

    public CustomerDto() {
    }

    public CustomerDto(String custId, String name, String dob, Double salary, String address) {
        this.custId = custId;
        this.custname = name;
        this.custdob = dob;
        this.custsalary = salary;
        this.custaddress = address;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the custname
     */
    public String getCustname() {
        return custname;
    }

    /**
     * @param custname the custname to set
     */
    public void setCustname(String custname) {
        this.custname = custname;
    }

    /**
     * @return the custdob
     */
    public String getCustdob() {
        return custdob;
    }

    /**
     * @param custdob the custdob to set
     */
    public void setCustdob(String custdob) {
        this.custdob = custdob;
    }

    /**
     * @return the custsalary
     */
    public Double getCustsalary() {
        return custsalary;
    }

    /**
     * @param custsalary the custsalary to set
     */
    public void setCustsalary(Double custsalary) {
        this.custsalary = custsalary;
    }

    /**
     * @return the custaddress
     */
    public String getCustaddress() {
        return custaddress;
    }

    /**
     * @param custaddress the custaddress to set
     */
    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custId=" + custId + ", custname=" + custname + ", custdob=" + custdob + ", custsalary=" + custsalary + ", custaddress=" + custaddress + '}';
    }

}
