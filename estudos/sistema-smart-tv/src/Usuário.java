public class Usuário {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Após ligar a TV: TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);

        smartTV.mudarCanal(5);
        System.out.println("Canal: " + smartTV.canal);

        smartTV.desligar();
        System.out.println("Após desligar a TV: TV ligada? " + smartTV.ligada);


    }
}
