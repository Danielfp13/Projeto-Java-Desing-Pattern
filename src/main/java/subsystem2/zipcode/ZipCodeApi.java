package subsystem2.zipcode;

public class ZipCodeApi {

    private static ZipCodeApi zipCodeApiInstance = new ZipCodeApi();

    private ZipCodeApi() {
    }

    public static ZipCodeApi getInstance() {
        return zipCodeApiInstance;
    }

    public String recoverCity(String zipCode) {
        return "Porto Alegre";
    }

    public String recoverState(String zipCode) {
        return "RS";
    }
}
