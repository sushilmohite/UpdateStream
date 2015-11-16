/**
 * File: Config.java
 *
 * @author Sushil Mohite
 */
package updatestream;

/**
 *
 * @author Sushil Mohite
 */
public class Config {
    public final static String PRICE_WATCH_URL = "http://localhost:8080";
    public final static String PRICE_WATCH_API = "/PriceWatch/webresources/resource/product?";
    
    public final static String GAS_FEED_URL = "http://api.mygasfeed.com";
    public final static String GAS_STATION_API = "/stations/details/";
    public final static String GAS_FEED_KEY = "mwl3tdh66y.json?";
    
    public final static int UPDATE_SERVICE_PORT = 25;
    
    public final static double INITIAL_PRICE = -1.0;
    public final static String MONGO_DB = "test";
    public final static String LATEST_PRICE_COLLECTION = "latest_test_update";
    public final static String MONGO_UPDATE_KEY = "$set";
}
