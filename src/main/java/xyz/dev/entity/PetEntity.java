package xyz.dev.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "CLIENT_PET")
public class PetEntity {

    @EmbeddedId
    private ClientEntity.ClientPKEntity pk;

    @Column(name = "PET_NAME", nullable = false)
    private String name;

    @Column(name = "PET_SIZE")
    private String size;

    @Column(name = "PET_AGE")
    private String age;

    @Column(name = "PET_LAST_VACCINE")
    private String lastVaccine;

    public ClientEntity.ClientPKEntity getPk() {
        return pk;
    }

    public void setPk(ClientEntity.ClientPKEntity pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLastVaccine() {
        return lastVaccine;
    }

    public void setLastVaccine(String lastVaccine) {
        this.lastVaccine = lastVaccine;
    }
}
