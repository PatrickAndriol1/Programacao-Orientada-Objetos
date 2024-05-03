import java.util.Scanner;

public class App {
    private static final int QUANTIDADE_PERGUNTAS = 3;
    private static char[] respostasUsuario = new char[QUANTIDADE_PERGUNTAS]; 
    private static char[] respostasCorretas = {'a','b','c'}; 
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nomeUsuario = receberNome();
        comecarQuiz(nomeUsuario);
        pergunta01();
        pergunta02();
        pergunta03();
        imprimirPontuacao(nomeUsuario);
        encerrarQuiz();
    }

    public static String receberNome(){
        System.out.print("Digite seu nome: ");
        String nome = "";
        while (nome.isBlank()){
            nome = SCAN.nextLine();
        }
        return formatarNome(nome);
    }

    public static String formatarNome(String nome){
        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetra = String.valueOf(primeiroNome.charAt(0));
        String nomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetra.toUpperCase() + nomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static void comecarQuiz(String nome){
        System.out.println(String.format(
            """
            Olá, %s!
            Iremos começar nosso quiz sobre filmes...

            Aperte ENTER para continuar.""",
            nome
        ));
        SCAN.nextLine();
    }

    public static char receberResposta(){
        String resposta = SCAN.nextLine();
        while(validar(resposta)){
            resposta = SCAN.nextLine();
        }
        resposta = resposta.trim();
        resposta = String.valueOf(resposta.charAt(0));
        resposta = resposta.toLowerCase();
        char respostaFinal = resposta.charAt(0);
        return respostaFinal;
    }

    public static boolean validar(String resposta){
        if(resposta.isBlank()){
            System.out.println("Resposta inválida, tente novamente...");
            return true;
        }
        return false;
    }

    public static void pergunta01(){
        System.out.println(String.format(
            """
            [PERGUNTA 01] - Qual dos filmes a seguir ganhador do Oscar é baseado em fatos reais:
            A - "Titanic"
            B - "Green Book - O Guia"
            C - "O Senhor dos Anéis: O Retorno do Rei" """
        ));
        respostasUsuario[0] = receberResposta();
        System.out.println("A resposta correta era: A - Titanic");
    }
    
    public static void pergunta02(){
        System.out.println(String.format(
            """
            [PERGUNTA 02] - Qual dos filmes a seguir tem protagonista feminina:
            A - "Karate Kid"
            B - "Jogos Vorazes"
            C - "As Tartarugas Ninja" """
        ));
        respostasUsuario[1] = receberResposta();
        System.out.println("A resposta correta era: B - Jogos Vorazes");
    }

    public static void pergunta03(){
        System.out.println(String.format(
            """
            [PERGUNTA 03] - Qual dos filmes foi baseado em um jogo:
            A - "Space Jam"
            B - "Jogador N° 1"
            C - "Uncharted" """
        ));
        respostasUsuario[2] = receberResposta();
        System.out.println("A resposta correta era: C - Uncharted\n");
    }

    public static void imprimirPontuacao(String nomeUsuario){
        int acertos = compararRespostas();
        System.out.println(String.format(
            """
            Parabéns %s por terminar o quiz,
            você acertou um total de %s pergunta(s)! 
            """,
            nomeUsuario,
            acertos
        ));
    }

    public static int compararRespostas(){
        int acertos = 0;
        for(int i = 0; i < QUANTIDADE_PERGUNTAS; i++){
            if(respostasUsuario[i] == respostasCorretas[i]){
                acertos++;
            }
        }
        return acertos;
    }

    public static void encerrarQuiz(){
        System.out.println(String.format(
            """
            Muito obrigado por jogar!!!
            Agora aperte ENTER para encerrar o jogo..."""));
        SCAN.nextLine();
    }
}
