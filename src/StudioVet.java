public class StudioVet {
    private int maxCani;
    private int maxGatti;
    private int currentGatti;
    private int currentCani;

    private int codaGatti;

    public StudioVet(int maxC, int maxG){
        this.maxCani = maxC;
        this.maxGatti = maxG;
        this.currentCani = 0;
        this.currentGatti = 0;
        this.codaGatti = 0;
    }

    public synchronized void entra(String specie){
        if (specie.equals("gatto")) codaGatti++;

        while((specie.equals("cane")) && (codaGatti > 0) || (currentCani >= maxCani) || (currentGatti >= maxGatti) || (specie.equals("gatto") &&  currentCani > 0)){
            try {
                wait();
                System.out.println("--- "+Thread.currentThread().getName()+" ("+specie+")" +" è in attesa ...");
            } catch (Exception e) {
                
            }
        }

        System.out.println("- "+Thread.currentThread().getName()+ " ("+specie+")" +" è entrato <--");

        if (specie.equals("gatto")) currentGatti++;
        else currentCani++;
    }

    public synchronized void esci(String specie){
        
        if (specie.equals("gatto")){
            codaGatti--;
            currentGatti--;
        }
        else currentCani --;
        
        System.out.println("-- "+Thread.currentThread().getName()+" ("+specie+")" +" è uscito --> gatti rimanenti: "+codaGatti);

        notifyAll();
    }

}
