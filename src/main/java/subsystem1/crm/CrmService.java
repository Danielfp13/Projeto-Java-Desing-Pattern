package subsystem1.crm;

public class CrmService {


    private CrmService() {
    }

    public static void recordCustomer(String name, String zipCode, String city, String state){
        System.out.println("Cliente salvo no sistema d CRM.");
        System.out.println(name);
        System.out.println(zipCode);
        System.out.println(state);
        System.out.println(city);
    }
}
