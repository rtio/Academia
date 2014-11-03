
import br.com.jupitertec.domain.City;
import br.com.jupitertec.domain.People;
import br.com.jupitertec.persistence.facade.PeopleFacade;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class NewClass {
    public static void main(String[] args) {        
        City city = new City(20, "CE", "Fortaleza");
        People people = new People();
        //people.setCityId(city);
        people.setPeopleCep("1234564");
        people.setPeopleComplement("Conj Beira rio");
        people.setPeopleCpf("123456465465465");
        people.setPeopleDistrict("Vila Velha");
        people.setPeopleId(20);
        people.setPeopleName("Rafael");
        people.setPeopleNasc(new Date());
        people.setPeopleSex("M");
        PeopleFacade facade = new PeopleFacade();
        facade.save(people);
    }
}
