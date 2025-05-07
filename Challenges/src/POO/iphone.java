package POO;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavergadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para..." + numero);

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");


    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando chamada...");

    }



    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);

    }


    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");

    }


    public void atualizarPagina() {
        System.out.println("Página atualizada.");

    }


    public void tocar() {
        System.out.println("Tocando música...");

    }


    public void pausar() {
        System.out.println("Música pausada.");

    }


    public void SelecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);

    }
}
