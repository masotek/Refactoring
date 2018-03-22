package com.infoshareacademy;

/**
 * Klasa reprezentujaca Okrąg.
 */
public class Okrag {

    public Integer promien;

    public Okrag(int r) {
        this(r, 0);
    }


    //??? todo Przemek - wywal ??
    public Okrag(int r, Integer x) {
        this.promien = r;
    }

    public Double obliczPolePow() {
        return 3.14159 * promien * promien;
    }

    public Double obliczObwod() {
        return 2 * 3.14159 * promien;
    }



    //todo A (extract)
    // uwaga - wszystkie operacje należy przeprowadzać poprzez narzędzie refaktoryzacji IJ, a nie "ręcznie".

    // 1. wyehstrahuj wyrażenie "promien * promien" jako osobną zmienną (w metodzie obliczPolePow)
    // 2. wykonaj ekstrahowanie liczby Pi do stałej (IJ powinien wykryć wszystkie użycia stałej 3.14 w całej klasie i dokonać zamian)
    // 3. wyodrębnij polePowierzchni i obwod jako pola w klasie


    //todo B (rename)
    // 0. dodaj gettery dla obwodu i polaPowierzchni (Alt + Insert)
    // 1. zmien nazwę pola "promien" na "r".
    // 2. zmien nazwy metod (np. zeby byly po angielsku). (Zainicjuj jedną z tych operacji z poziomu pliku OkragTest.java,
    //   a drugą z poziomu obecnego pliku)
    // 3. zmień nazwę klasy na Circle
    // 4. zmień package na com.infoshareacademy.geometry



    // todo C (change signature)
    // 1. zmien parametr konstruktora z int na Integer (używając opcji "change signature"). Zmień też nazwę parametru na
    // "promien".
    // 2a. dodaj nowe parametry do kontruktora (x i y) oznaczające środek okręgu w układzie współrzędnych. Nadaj
    //   wartości domyślne (np. x=0, y=0), tak aby IJ mógł przeprowadzić zmiany w istniejącym kodzie.
    // 2b. Zrób to samo bez podawania wartości defaultowej. Co się stanie?
    // 2c. (opcja) Zmień kolejność parametrów konstruktora (np. x, y, r).
    // 2d. (opcja) Usuń x i y jako parametry wejściowe (jak zawsze używając tylko menu refactor)
    // 3. Zmień metodę obliczPolePow tak, żeby zwracała Float.




    // todo D
    // 1. Stwórz interface (extract interface)
    // 2. ukryj dostęp do pola r(promien). (Encapsulate Field)



    // pamiętaj - po każdej refaktoryzacji testy jednostkowe powinny nadal działać.



}
