public class Address {
    private String street;
    private int number;
    private String town;
    Address(String street,int number,String town)
    {
        this.street=street;
        this.number=number;
        this.town=town;
    }
    public void display()
    {

        System.out.println(street+" "+number+" "+town);
    }
}
