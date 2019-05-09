import java.util.*;


class Main extends User{

	public static void main(String[] args) {

		User user = new User();
		user.create();
		System.out.println("SHOW USERS");
		ArrayList<User> users = user.getUsers();
		users.forEach(u->System.out.println(u.toString()));

		Bank bank = new Bank();
		bank.createBankAccount();
		System.out.println("SHOW BANK");
		ArrayList<Bank> bankAcc = bank.getbankAcc();
		bankAcc.forEach(b->System.out.println(b.toString()));
		

		


	}
}