import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // Anotação aplicável a classes
@Retention(RetentionPolicy.RUNTIME) // Disponível em tempo de execução
public @interface Tabela {
    String valor(); // Define o nome da tabela
}