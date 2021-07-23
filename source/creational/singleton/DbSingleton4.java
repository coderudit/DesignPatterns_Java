package creational.singleton;

/**
 * This is lazy loaded and thread-safe using volatile keyword. Volatile keyword
 * is used to modify the value of a variable by different threads. It is also
 * used to make classes thread safe. It means that multiple threads can use a
 * method and instance of the classes at the same time without any problem.
 */
public class DbSingleton4 {
	private static volatile DbSingleton4 instance = null;

	private DbSingleton4() {
		// This will save us from creating the instance using reflection.
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create.");
		}
	}

	// Synchronizing the whole class will have a performance hit. This is because
	// everytime we ask for an instance, whole class will be synchronized.
	public static DbSingleton4 getInstance() {
		if (instance == null)
			synchronized (DbSingleton4.class) {
				// Checking it again. Consider if 2 threads are there, and both have checked
				// that instance that it is
				// null, both will come to synchronized code line. 1 will enter and hold the
				// lock and create instance.
				// Then, second also will create instance because it has entered the instance
				// when it was null.
				if (instance == null) {
					instance = new DbSingleton4();
				}
			}
		return instance;
	}
}
