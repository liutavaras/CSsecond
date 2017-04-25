package com.example.liutaurasmazonas.cslogintrying;


/**
 * Created by Joe on 13/04/2017.
 */

public class Clients {

    String clientName;
    String clientCareer;
    Boolean techCB;
    Boolean mediCB;
    Boolean renewableEnergyNF;
    Boolean googleNF;
    Boolean novartisNF;
    Boolean teslaNF;
    Boolean fbLRS;
    Boolean applLRS;
    Boolean yhooLRS;
    Boolean eurusdCB;
    Boolean usdrubCU;
    Boolean silverCO;
    Boolean goldCO;
    Boolean gbpusdCU;
    Boolean nsdqI;
    Boolean sp500I;
    String image;


public Clients() {}


    public Clients(String key, String clientName, String clientCareer, Boolean techCB, Boolean mediCB, Boolean renewableEnergyNF,
                   Boolean googleNF, Boolean novartisNF, Boolean teslaNF, Boolean fbLRS, Boolean applLRS, Boolean yhooLRS, Boolean eurusdCB,
                   Boolean usdrubCU, Boolean silverCO, Boolean goldCO, Boolean gbpusdCU, Boolean nsdqI, Boolean sp500I, String image) {

        this.clientName = clientName;
        this.clientCareer = clientCareer;
        this.techCB = techCB;
        this.mediCB = mediCB;
        this.renewableEnergyNF = renewableEnergyNF;
        this.googleNF = googleNF;
        this.novartisNF = novartisNF;
        this.teslaNF = teslaNF;
        this.fbLRS = fbLRS;
        this.applLRS = applLRS;
        this.yhooLRS = yhooLRS;
        this.eurusdCB = eurusdCB;
        this.usdrubCU = usdrubCU;
        this.silverCO = silverCO;
        this.goldCO = goldCO;
        this.gbpusdCU = gbpusdCU;
        this.nsdqI = nsdqI;
        this.sp500I = sp500I;
        this.image = image;

    }



    public String getClientName() {
        return clientName;
    }

    public String getClientCareer() {
        return clientCareer;
    }

    public Boolean getTechCB() {
        return techCB;
    }

    public Boolean getMediCB() {
        return mediCB;
    }

    public Boolean getRenewableEnergyNF() {
        return renewableEnergyNF;
    }

    public Boolean getGoogleNF() {
        return googleNF;
    }

    public Boolean getNovartisNF() {
        return novartisNF;
    }

    public Boolean getTeslaNF() {
        return teslaNF;
    }

    public Boolean getFbLRS() {
        return fbLRS;
    }

    public Boolean getApplLRS() {
        return applLRS;
    }

    public Boolean getYhooLRS() {
        return yhooLRS;
    }

    public Boolean getEurusdCB() {
        return eurusdCB;
    }

    public Boolean getUsdrubCU() {
        return usdrubCU;
    }

    public Boolean getSilverCO() {
        return silverCO;
    }

    public Boolean getGoldCO() {
        return goldCO;
    }

    public Boolean getGbpusdCU() {
        return gbpusdCU;
    }

    public Boolean getNsdqI() {
        return nsdqI;
    }

    public Boolean getSp500I() {
        return sp500I;
    }

    public String getImage() {
        return image;
    }



}






