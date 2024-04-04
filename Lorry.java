
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public int getNumberOfPallets(){
        return numberOfPallets;
    }

    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }

    public int getTrailers(){
        return trailers;
    }

    public void setTrailers(int trailers){
        this.trailers = trailers;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Número de Paletes", this.numberOfPallets));
        sb.append(String.format("%15s: %s\n", "Número de Atrelados", this.trailers));

        return sb.toString();
    }
    
    @Override
    public String getTransportType() {
        return "Camião";
    }
}
