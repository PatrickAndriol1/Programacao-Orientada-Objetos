
import hogwarts.Aluno;
import hogwarts.Professor;



public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Joao", "joao123@email.com", "40028922");
        Professor professor = new Professor("Kleber", "kleber@edu.br", "Inglês");
        
        aluno.exibirInfo();
        professor.exibirInfo();
        
        aluno.exibirInfo(true, false, true);
        professor.exibirInfo(false, true, false);
    }
}
