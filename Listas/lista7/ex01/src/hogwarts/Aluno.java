package hogwarts;

public class Aluno extends Usuario{
    private String matricula;

    public Aluno(String nome, String email, String matricula){
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo(){
        System.out.println(String.format(
            """
            Nome: %s
            E-mail: %s
            Matrícula: %s
            """,
            getNome(), getEmail(), matricula
        ));
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula){
        if(exibirNome){
            System.out.println("Nome: " + getNome());
        }
        if(exibirEmail){
            System.out.println("E-mail: " + getEmail());
        }
        if(exibirMatricula){
            System.out.println("Matrícula: " + matricula);
        }
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}

 