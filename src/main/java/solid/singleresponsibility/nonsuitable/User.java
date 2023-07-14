package main.java.solid.singleresponsibility.nonsuitable;

public class User {
    private Long id;
    private String name;
    private String street;
    private String city;
    private String username;

    public void changeAddress(String street, String city) {
        System.out.println(street+ "," + city);
    }

    public void login(String username) {
        System.out.println(username + "login");
    }

    public void logout(String username) {
        System.out.println(username + "logout");
    }

}
