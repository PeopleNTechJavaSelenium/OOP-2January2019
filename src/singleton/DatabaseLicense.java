package singleton;

public class DatabaseLicense {

	private DatabaseLicense() {}
	
	public static DatabaseLicense getInstance() {
		DatabaseLicense dbLicense = new DatabaseLicense();
		return dbLicense;
	}
	
	public void databaseFeatures() {
		System.out.println("We have SQl database features");
	}	
	
}
