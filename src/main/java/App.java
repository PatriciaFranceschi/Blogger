import java.util.Date;

public class App {
    public static void main(String[] args) {
        Article[] articles = new Article[3];


        articles[0] = new Article("Java per iniziare", "Contenuto articolo 1", new Date(), "James Cameron");
        articles[1] = new Article("Python Master", "Contenuto articolo 2", new Date(), "Al Pacino");
        articles[2] = new Article(":Net Avanzzato", "Contenuto articolo 3", new Date(), "Sidney Sheldon");


        System.out.println("Elenco degli articoli:");
        for (Article article : articles) {
            System.out.println("Titolo: " + article.getTitle());
            System.out.println("Contenuto: " + article.getContent());
            System.out.println("Data: " + article.getDate());
            System.out.println("Autore: " + article.getAuthor());
            System.out.println("-----------------------");

            Article newArticle = new Article("Javascript ", "Contenuto articolo 4", new Date(), "Clarice Lispector");

            Blog myBlog = new Blog(10);
            myBlog.addArticle(newArticle);

            System.out.println("Titolo: " + newArticle.getTitle());
            System.out.println("Contenuto: " + newArticle.getContent());
            System.out.println("Data: " + newArticle.getDate());
            System.out.println("Autore: " + newArticle.getAuthor());
        }
    }
}
