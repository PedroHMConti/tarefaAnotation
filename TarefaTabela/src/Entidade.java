import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Tabela(valor = "carros")
class Entidade {
    public static void main(String[] args) {
        // Obtendo o valor da anotação
        if (Entidade.class.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = Entidade.class.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.valor());
        }
    }
}