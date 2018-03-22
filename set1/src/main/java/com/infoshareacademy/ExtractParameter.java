
package com.infoshareacademy;


import java.util.List;

public class ExtractParameter {

    //todo: Dodaj nowe parametry wejściowe do metody, tak żeby można było dowolnie nazwać listy (np. zamiast list1= chcę mieć mojaLista=).
    // użyj opcji "extract parameter"

    public String jakasKiepskaMetoda(List<String> list1, List<String> list2) {

        StringBuilder calosc = new StringBuilder();

        calosc.append("list1=");
        calosc.append("[");
        for (String s : list1) {
            calosc.append(s);
            calosc.append(",");
        }
        calosc.append("]; ");

        calosc.append("list2=");
        calosc.append("[");
        for (String s : list2) {
            calosc.append(s);
            calosc.append(",");
        }
        calosc.append("]");

        return calosc.toString();
    }

}
