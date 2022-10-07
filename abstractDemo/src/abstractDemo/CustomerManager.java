package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager; //hangi veritabanını verirsen o çalışır
	public void getCustomers() {
		databaseManager.getData();
	}
}
