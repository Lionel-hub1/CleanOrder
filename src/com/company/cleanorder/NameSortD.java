package com.company.cleanorder;

import java.util.Comparator;

public class NameSortD implements Comparator<ClientDetails> {
    public int compare(ClientDetails b1, ClientDetails b2) {
        return b2.clientName.compareTo(b1.clientName);
    }
}
