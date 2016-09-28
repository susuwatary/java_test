package ru.stqa.pft.addressbook;

public class GroupContsct {
    private final String name;
    private final String lastname;
    private final String address;
    private final String tel;
    private final String email;

    public GroupContsct(String name, String lastname, String address, String tel, String email) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }
}
