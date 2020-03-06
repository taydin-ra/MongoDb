import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.testng.annotations.Test;

public class MongoTest {
    @Test

    public void test() {
        MongoClient mongoClient = MongoClients.create("mongodb://techno:ee4CvCRPhor5@185.97.114.201:27118/?authSource=cloud-school");
        MongoDatabase database = mongoClient.getDatabase("cloud-school");
        MongoCollection<Document> collection = database.getCollection("school_city");
        System.out.println(collection.countDocuments()); 
    }
}
