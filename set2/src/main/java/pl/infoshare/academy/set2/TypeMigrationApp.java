package pl.infoshare.academy.set2;

import pl.infoshare.academy.set2.company.Company;
import pl.infoshare.academy.set2.outsourcing.RecruitmentAgency;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class TypeMigrationApp {

    public static final String COMPANY_NAME = "infoShare Academy";

    public static void main(final String[] args) {

        final RecruitmentAgency recruitmentAgency = new RecruitmentAgency();

        final Company company = new Company(COMPANY_NAME, recruitmentAgency);

        System.out.println("Company address: " + company.getAddress());

        company.hireManagement();
        company.listAllEmployees();
    }


    /* todo:
        0. Zapoznaj się z powyzszą metodą main. Uruchom ją, Co wyświetla się w konsoli?
        1. Zrefaktoryzuj aplikację - zmień w klasie Company pole employees z listy na set. Wykorzystaj refactoring "type migration".
        2. Czy refaktoryzowałeś w "spokoju"? Czy czegoś Ci może brakowało? Jak upewniłeś się, że dokonane zmiany
         zostały wykonane prawidłowo i aplikacja nadal działa tak samo?

      */

}
