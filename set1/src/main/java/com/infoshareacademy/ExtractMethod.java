
package com.infoshareacademy;


import java.util.List;

public class ExtractMethod {

    //todo: sprójrz co robi metoda. Czy widzisz fragmentu kodu które się powtarzają?
    // Spróbuj skrócić metodę zwiększając jej czytelność przez refactoring "Extract method".
    // (czy IntelliJ było "inteligentne" i wykryło duplikację?)

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
