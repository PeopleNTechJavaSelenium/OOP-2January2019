package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		DatabaseLicense db1 = DatabaseLicense.getInstance();
		db1.databaseFeatures();
		
		DatabaseLicense db2 = DatabaseLicense.getInstance();
		db2.databaseFeatures();

	}

}
