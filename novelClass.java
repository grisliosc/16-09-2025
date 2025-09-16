public class novelClass {
    private String title;
    private String author;
    private int ISBNT;
    private String genre;
    private double price;

    //Constructor Parameter
    public novelClass(String t, String a, int i, String g, double p){
        title = t;
        author = a;
        ISBNT = i;
        genre = g;
        price = p;
    }

    //Getter
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getISBNT(){
        return ISBNT;
    }
    public String getGenre(){
        return genre;
    }
    public double getPrice(){
        return price;
    }

    //Setter
    public void setTitle(String t){
        title = t;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setISBNT(int i){
        ISBNT = i;
    }
    public void setGenre(String g){
        genre = g;
    }
    public void setPrice(double p){
        price = p;
    }

    //Method
    public void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBNT : "+ISBNT);
        System.out.println("Genre : "+genre);
        System.out.println("Price : "+price);
        System.out.println();
    }
}
