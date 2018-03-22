package pl.infoshare.academy.set3;

import pl.infoshare.academy.set3.company.Company;
import pl.infoshare.academy.set3.outsourcing.RecruitmentAgency;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class UpDownApp {

    public static final String COMPANY_NAME = "infoShare Academy";

    public static void main(final String[] args) {

        final RecruitmentAgency recruitmentAgency = new RecruitmentAgency();

        final Company company = new Company(COMPANY_NAME, recruitmentAgency);

        System.out.println("Company address: " + company.getAddress());

        company.hireManagement();
        company.listAllEmployees();
        company.runBusiness();
    }


    /*
    todo:
        1. Przyjrzyj się package employee, jaką widzisz tam hierarchię klas? (Naszkicuj diagram klas z tego pakietu).
        2. Spróbuj dokonać operacji Push Members Down na metodzie getRoles. Jakie problemy napotkał IJ ? Użyj opcji
        "Show conflicts in view".
        3. Dodaj nową metodę getSex() do klasy CTOEmployee zwracająca F lub M w zależności od płci pracownika. Dodaj nowy parametr do konstruktora
        klasy CTOEmployee, tak, żeby można było określić płeć pracownika.
        4. Załóżmy, że zmiany spodobały się i chcemy wprowadzić płeć dla wszystkich pracowników. Używając opcji "Pull Members Up"
        dokonaj refaktoryzacji wprowadzając pole "sex" do klasy Employee.
        5. Wykonaj "Push Members Down" na polu sex w klasie Employee.
     */


}
