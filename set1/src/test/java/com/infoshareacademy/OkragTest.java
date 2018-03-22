package com.infoshareacademy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class OkragTest {

    @Test
    public void polePow_promienJednostkowy_pi() {
        Okrag o = new Okrag(1);
        assertThat(o.obliczPolePow()).isEqualTo(3.14159);
    }

    @Test
    public void polePow_promien2() {
        Okrag o = new Okrag(2);
        assertThat(o.obliczPolePow()).isEqualTo(12.56636);
    }

    @Test
    public void obwod_promienJednostkowy_pi() {
        Okrag o = new Okrag(1);
        assertThat(o.obliczObwod()).isEqualTo(6.28318);
    }

    @Test
    public void obwod_promien2() {
        Okrag o = new Okrag(2);
        assertThat(o.obliczObwod()).isEqualTo(12.56636);
    }

    @Test
    public void promien2_obwodJestRownyPoluPowierzchni() {
        Okrag o = new Okrag(2);
        assertThat(o.obliczObwod()).isEqualTo(o.obliczPolePow());
    }

}