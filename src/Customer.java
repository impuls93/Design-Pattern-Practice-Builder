
public class Customer {

	private String name;
	private String surname;
	private String login;
	private String password;
	
	
	public Customer(Builder builder)
	{
		this.name = builder.name;
		this.surname = builder.surname;
		this.login = builder.login;
		this.password = builder.password;
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	
	public static class Builder
	{
		private final String name;
		private String surname;
		private String login;
		private String password;
		
		public Builder(String name)
		{
			this.name = name;
		}
		public Builder surname(String surname)
		{
			this.surname = surname;
			return this;
		}
		public Builder login(String login)
		{
			this.login = login;
			return this;
		}
		public Builder password(String password)
		{
			this.password = password;
			return this;
		}
		public Customer build()
		{
			return new Customer(this);
		}
		
		
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(this.name+" ");
		sb.append(this.surname+" ");
		sb.append(this.login+" ");
		sb.append(this.password);
		String toString = sb.toString();
		return toString;
	}
	
	
	
}
