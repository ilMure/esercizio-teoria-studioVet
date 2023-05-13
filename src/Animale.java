public class Animale extends Thread{
    private StudioVet studio;
    private String specie = "";

    public Animale(String name, StudioVet studio, String specie){
        super(name);
        this.specie = specie;
        this.studio = studio;
    }

    @Override
    public void run() {
        int durataVisita = (int) (Math.random()*2000 + 1);
        studio.entra(specie);
        try {
            sleep(durataVisita);
        } catch (Exception e) {
            
        }
        studio.esci(specie);
    }
}