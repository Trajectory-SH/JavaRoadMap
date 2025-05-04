package second.lang.immutable;

public class MemberV1 {

    private String name;
    private Address address;

    public MemberV1(String name,Address address) {
        this.address = address;
        this.name = name;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
               "address=" + address +
               ", name='" + name + '\'' +
               '}';
    }
}
