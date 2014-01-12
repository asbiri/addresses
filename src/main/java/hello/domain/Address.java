package hello.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by astrid on 12.01.14.
 */

public class Address {
    private String name;
    private String zip;

    @Id
    private String id;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Address(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }
}
