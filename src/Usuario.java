public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();

            smartTv.mudarDecanal(05);
        System.out.println("CANAL ATUAL ? " + smartTv.canal);
       
        System.out.println("TV LIGADA? " + smartTv.ligada);
        System.out.println("CANAL ATUAL ? " + smartTv.canal);
        System.out.println("VOLUME ATUAL ? " + smartTv.volume);
        
    
        smartTv.ligar();
        System.out.println("NOVO STATUS -> TV LIGADA? " + smartTv.ligada);

         smartTv.deligar();
        System.out.println("NOVO STATUS -> TV LIGADA? " + smartTv.ligada);
    }
}
