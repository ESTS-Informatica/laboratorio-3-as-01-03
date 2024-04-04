
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    public static void main(String[] args){
        ShippingCompany shippingCompany = new ShippingCompany("RELIABLE-MOVING");

        shippingCompany.add(new GroundTransportation("00-AA-00"));
        shippingCompany.add(new AirTransportation("Airbus A380", 13));
        shippingCompany.add(new AirTransportation("Boeing 747", 30));
        shippingCompany.add(new Lorry(15, 2, "11-AA-22"));
        shippingCompany.add(new Van(50, "99-ZZ-99"));

        System.out.println(shippingCompany.toString());
    }
}
