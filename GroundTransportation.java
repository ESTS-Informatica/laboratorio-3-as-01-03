
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static final double FEES = 3.0;

    public GroundTransportation(String licensePlate)
    {
        super();
        setFees(FEES);
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        if(licensePlate != null){
            this.licensePlate = licensePlate;
        }
    }

    @Override
    public String getTransportType(){
        return "Transporte terrestre";
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matrícula", this.licensePlate));

        return sb.toString();
    }
}
