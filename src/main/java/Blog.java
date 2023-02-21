public class Blog {
    private Article[] articles;
    private int numArticles; // numero di articoli presenti nell'array

    public Blog(int capacity) {
        articles = new Article[capacity];
        numArticles = 0;
    }

    public void addArticle(Article article) {
        if (numArticles < articles.length) {
            articles[numArticles] = article;
            numArticles++;
            System.out.println("Articolo aggiunto con successo.");
        } else {
            System.out.println("Impossibile aggiungere l'articolo: array di articoli pieno.");
        }
    }

}