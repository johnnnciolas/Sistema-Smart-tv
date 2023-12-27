public class SmartTv{
    boolean ligada= false;
    int canal=1;
    int volume=25;

    public void mudarDecanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirDecanal(){
        canal--;
    }
     public void aumentarDecanal(){
        canal++;
    } 
    
    public void aumentarVolume(){
        volume++;
        System.out.println("AUMENTANDO O VOLUME PARA:  " +volume);
       
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("DIMINUINDO O VOLUME PARA: "+ volume);
        
    }
    
    public void ligar(){
        ligada=true;
    }
  public void deligar(){
        ligada=false;
    }

}
