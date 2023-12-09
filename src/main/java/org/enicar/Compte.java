package org.enicar;

import java.util.Date;

public class Compte {
    int code;
    int solde;
    Date datecreation;

    public Compte() {
        super();

    }

    public Compte(int code, int solde, Date datecreation) {
        super();
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }

    public int getCode() {
        return code;
    }

    public int getSolde() {
        return solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
