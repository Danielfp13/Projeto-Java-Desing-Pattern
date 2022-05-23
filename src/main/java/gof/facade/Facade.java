package gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.zipcode.ZipCodeApi;

public class Facade {


    public void clientMigrate(String name, String zipCode) {
        String city = ZipCodeApi.getInstance().recoverCity(zipCode);
        String state = ZipCodeApi.getInstance().recoverState(zipCode);

        CrmService.recordCustomer(name,zipCode,city,state);
    }
}
