package main.java.solid.singleresponsibility.suitable;

public class User {

    private Long id;
    private Address name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getName() {
        return name;
    }

    public void setName(Address name) {
        this.name = name;
    }
}
