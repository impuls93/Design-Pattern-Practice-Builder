
public class Client {

	public static void main(String[] args)
	{
		System.out.println("Imie : Nazwisko : Login : Haslo");
		Customer cust1 = new Customer.Builder("Micha�")
				.surname("Wsu�")
				.login("impuls")
				.password("impuls")
				.build();
		System.out.println(cust1);
	}
}
