package com.company.cleanorder;

import java.util.Comparator;

public class NameSortA implements Comparator<ClientDetails> {
    public int compare(ClientDetails b1, ClientDetails b2) {
        return b1.clientName.compareTo(b2.clientName);
    }
}
