public class Main {
    public static void main(String[] args) {
        iPhone iPhone15 = new iPhone("15 Pro Max", "352739208008976");

        // Dados do iPhone
        System.out.println("\n--------------------------");
        System.out.println("[ Dados do iPhone ]");
        System.out.println("Modelo: " + iPhone15.getModelo());
        System.out.println("IMEI: " + iPhone15.getImei());

        System.out.println("--------------------------\n");

        // Reprodutor Musical
        System.out.println("[ Reprodutor Musical ]");
        iPhone15.tocar();
        iPhone15.pausar();
        iPhone15.selecionarMusica("Enjoy the silence");

        System.out.println();

        // Navegador de Internet
        System.out.println("[ Navegador de Internet ]");
        iPhone15.exibirPagina("www.google.com.br");
        iPhone15.adicionarNovaAba();
        iPhone15.atualizarPagina();

        System.out.println();

        // Aparelho Telefônico
        System.out.println("[ Aparelho Telefônico ]");
        iPhone15.ligar("190");
        iPhone15.atender();
        iPhone15.iniciarCorreioVoz();

        System.out.println();
    }
}