public class Author {
    int id;
    String firstName;
    String lastName;

    static int[] ids;
    static {
        ids = new int[100];
    }

    public Author(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
