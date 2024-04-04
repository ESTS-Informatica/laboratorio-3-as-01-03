
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    private int packages;

    public Van(int packages, String licensePlate)
    {
        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages(){
        return packages;
    }

    public void setPackages(int packages){
        this.packages = packages;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Número de Pacotes", this.packages));

        return sb.toString();
    }
    
    @Override
    public String getTransportType() {
        return "Furgoneta";
    }
}
