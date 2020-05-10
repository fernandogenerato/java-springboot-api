package xyz.dev.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class ClientVO implements Serializable {

    private String name;
    private String cellphone;
    private String mail;
    private ArrayList<PetVO> petList;
    private String document;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<PetVO> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<PetVO> petList) {
        this.petList = petList;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
