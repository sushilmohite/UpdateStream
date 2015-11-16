/**
 * File: Server.java
 *
 * @author Sushil Mohite
 */
package updatestream;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

/**
 *
 * @author Sushil Mohite
 */
public class Server {
    
    public static void main(String args[]) {
        MongoCollection latestPriceCol = new MongoClient().getDatabase(Config.MONGO_DB)
                .getCollection(Config.LATEST_PRICE_COLLECTION);
        
        new Sender(latestPriceCol).start();
        new Receiver(latestPriceCol).start();
    }
}
