/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
