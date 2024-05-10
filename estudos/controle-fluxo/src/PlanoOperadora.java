public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":{
                System.out.println("5GB de internet para YouTube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram ilimitados");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
