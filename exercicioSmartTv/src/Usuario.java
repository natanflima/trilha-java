public class Usuario {
    public static void main(String[] args) {

        /*
         * Exercício Smart TV
         * 1. A tv deve possuir características: ligada, canal, volume
         * 2. Poderá aumentar e diminuir o volume sempre em =1 ou -1
         * 3. Poderá mudar de canal de 1 em 1 ou definindo o número correspondente
         */

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // Volume
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // Ligar e desligar
        smartTv.ligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);

        // Mudar de Canal
        smartTv.subirCanal();
        System.out.println();

        smartTv.descerCanal();
        System.out.println();

        // Definindo um canal
        smartTv.mudarCanal(13);
        System.out.println("Novo Canal: " + smartTv.canal);

    }
}