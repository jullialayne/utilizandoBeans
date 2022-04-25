package utilizandobeans.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Harry Potter");
		livro.setCodigo("9 3/4");;
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("J.K.Rowling");
		
		livro.exibir();
		((AbstractApplicationContext) factory).close();
	}

}
