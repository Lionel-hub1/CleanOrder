package com.company.cleanorder;

public class ClientDetails {
    String clientName;
    int itemNumber;
    String clientLocation;

    ClientDetails(String clientName, int itemNumber, String clientLocation) {
        this.clientName = clientName;
        this.itemNumber = itemNumber;
        this.clientLocation = clientLocation;
    }
}
