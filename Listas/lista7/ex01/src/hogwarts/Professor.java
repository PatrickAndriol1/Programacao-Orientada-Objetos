package hogwarts;

public class Professor extends Usuario{
    private String disciplina;

    public Professor(String nome, String email, String disciplina){
        super(nome, email);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo(){
        System.out.println(String.format(
            """
            Nome: %s
            E-mail: %s
            Disciplina: %s
            """,
            getNome(), getEmail(), disciplina
        ));
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina){
        if(exibirNome){
            System.out.println("Nome: " + getNome());
        }
        if(exibirEmail){
            System.out.println("E-mail: " + getEmail());
        }
        if(exibirDisciplina){
            System.out.println("Matrícula: " + disciplina);
        }
    }

    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
}
 