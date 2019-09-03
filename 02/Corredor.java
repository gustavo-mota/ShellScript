public class Corredor extends Thread{
    String nome;
    //distância percorrida para inicar um descanso
    int descanso;
    //distancia da corrida
    int corrida;

    public Corredor(String nome, int descanso, int corrida){
        this.nome = nome;
        this.descanso = descanso;
        this.corrida = corrida;
    }

    public void run(){
        for(int i=0; i<this.corrida;i++){
            System.out.println("Faltam "+i+" metros para o corredor "+ nome);
            if(i==this.descanso){
                System.out.println("Corredor "+nome+" está descansando");
                try{
                    //descanso padrão
                    Thread.sleep(4 *1000);
                }catch (Exception e){

                }
            }
        }
        System.out.println("Corredor "+nome+" chegou!");
    }
}
