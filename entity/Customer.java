
package entity;

public class Customer {
    private String name;
    private String nid;
    private String contractnumber;
    private String gender;
 private Ticket ticket[] = new Ticket[4];
    

    public Customer(String name, String nid, String contractnumber, String gender) {
        this.name = name;
        this.nid = nid;
        this.contractnumber = contractnumber;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void setContractnumber(String contractnumber) {
        this.contractnumber = contractnumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getNid() {
        return nid;
    }

    public String getContractnumber() {
        return contractnumber;
    }

    public String getGender() {
        return gender;
    }


public void customerDisplayInfo() {
    System.out.println("Customer Name: " + name);
    System.out.println("NID: " + nid);
    System.out.println("Contract Number: " + contractnumber);
    System.out.println("Gender: " + gender);
}


}