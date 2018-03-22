package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ExtractParameterTest {

    @Test
    public void jakasKiepskaMetoda_dwieNiepusteListy_listingOk() {


        List<String> l1 = new ArrayList<>();
        l1.add("l11");
        l1.add("l12");

        List<String> l2 = new ArrayList<>();
        l2.add("l21");
        l2.add("l22");


        String out = new ExtractParameter().jakasKiepskaMetoda(l1, l2);
        assertThat(out).isEqualTo("list1=[l11,l12,]; list2=[l21,l22,]");
    }



}