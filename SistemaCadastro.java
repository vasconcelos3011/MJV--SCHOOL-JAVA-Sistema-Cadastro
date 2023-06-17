import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import classes.Cadastro;
import classes.Sexo;

public class SistemaCadastro {
    public static void main (String[] args) {
        Cadastro cadastro = new Cadastro(
            "Alberto Siqueira",
            "002.453.891-85",
            LocalDate.parse("1971-03-31"),
            Sexo.Masculino,
            "Rua Bom Pastor Zé",
            51,
            "Casa",
            "Chacrinha",
            "Rio de janeiro",
            "RJ",
            "Albertos71@email.com",
            2127722514L,
            21996543504L,
            true,
            "Desenvolvedor FullStack",
            "Microsoft",
            10300.71,
            true,
            12200.00,
            21000.00,
            "Java, C#, Python, Angular, ReactJS, WordPress"
        );

        gerarItem(cadastro);
    }

    public static void gerarItem(Cadastro item){
        StringBuilder novaString = new StringBuilder();

        novaString.append(item.nome + ";");
        novaString.append(item.cpf + ";");
        novaString.append(item.dataNascimento + ";");
        novaString.append(item.sexo+ ";");
        novaString.append(item.logradouro + ";");
        novaString.append(item.numero + ";");
        novaString.append(item.complemento + ";");
        novaString.append(item.bairro + ";");
        novaString.append(item.cidade + ";");
        novaString.append(item.estado + ";");
        novaString.append(item.email + ";");
        novaString.append(item.telefone + ";");
        novaString.append(item.celular + ";");
        novaString.append(item.celularWhats + ";");
        novaString.append(item.profissao + ";");
        novaString.append(item.empresa + ";");
        novaString.append(item.salario + ";");
        novaString.append(item.empregoAtual + ";");
        novaString.append(item.pretencaoMinima + ";");
        novaString.append(item.pretencaoMaxima + ";");
        novaString.append(item.habilidades + ";");

        System.out.println(novaString);

        cadastrar(novaString);
    }

    public static void cadastrar(StringBuilder item){
        String itemEnvio = item.toString() + System.lineSeparator();

        try{
            Path path = Paths.get("./arquivo/cadastro.csv");
                       
            Files.write(path, itemEnvio.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception exception){
            System.out.println();
        }        
    }
}