
package com.infoshareacademy;


import java.util.List;

/**
 * kod klasy ExtractMethod2 jest odpowiednikiem klasy "ExtractMethod" po refaktoryzacji.
 */
public class ExtractMethod2 {

    //todo: zlikwiduj metodę "listujListe" poprzez refactoring inline

    public String jakasKiepskaMetoda(List<String> list1, List<String> list2) {
        StringBuilder calosc = new StringBuilder();

        calosc.append("list1=");
        listujListe(list1, calosc, "]; ");

        calosc.append("list2=");
        listujListe(list2, calosc, "]");

        return calosc.toString();
    }

    private void listujListe(List<String> list1, StringBuilder calosc, String str3) {
        calosc.append("[");
        for (String s : list1) {
            calosc.append(s);
            calosc.append(",");
        }
        calosc.append(str3);
    }


}
