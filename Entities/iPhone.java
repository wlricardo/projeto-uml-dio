public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    // Métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo playlist.");
    }

    @Override
    public void pausar() {
        System.out.println("Execução da playlist pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Em execução: " + musica + ".");
    }

    // Métodos do Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("URL: " + url + ".");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando mensagem para o correio de voz.");
    }
}
