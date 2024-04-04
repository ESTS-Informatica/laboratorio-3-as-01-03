import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name)
    {
        inService = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void makeTransportation(String id, String origin, String destination, double price){
        Transport transport = getTransportation(id);
        if(transport != null && transport.isAvailable()){
            transport.setValues(origin, destination, price);
            inService.add(transport);
            remove(transport);
        }
    }

    public void finalizeTransport(String id){
        Iterator<Transport> it = inService.iterator();
        while(it.hasNext()){
            Transport transport = it.next();
            if(transport.getId().equalsIgnoreCase(id)){
                transport.resetValues();
                it.remove();
                add(transport);
            }
        }
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        forEach((transport) -> {           
                    sb.append(transport.toString());
            });

        return sb.toString();
    }

    private Transport getTransportation(String id) {
        for (Transport transport : this) {
            if (transport.getId().equalsIgnoreCase(id)) {
                return transport;
            }
        }
        return null;
    }
}
