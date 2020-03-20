package steps.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.xml.bind.SchemaOutputResolver;
import java.io.FileReader;


public class MyStepdefs {


    JSONObject jsonObject;


    @Given("^Read a tangerine json file$")
    public void read_a_tangerine_json_file() throws Throwable {

        //File reading using File class
      /* File file = new File("Tang.json");
        System.out.println(file.exists());*/


        //File reading using parser
        //carona peak time day2
        //comment please
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("Tang.json"));
        jsonObject = (JSONObject) obj;
        System.out.println("JSON Response :: " + jsonObject.toString());
        int length = jsonObject.size();
        System.out.println(length);


    }

    @Then("^Get all key Value pairs$")
    public void get_all_key_Value_pairs() throws Throwable {


        Object orderNumber = jsonObject.get("orderNumber");
        System.out.println("orderNumber is " + orderNumber);

        Object versionNumber = jsonObject.get("versionNumber");
        System.out.println("versionNumber is " + versionNumber);
        Object companyId = jsonObject.get("companyId");
        System.out.println("companyId is " + companyId);

        Object banner = jsonObject.get("banner");
        System.out.println("banner is " + banner);

        Object storeNumber = jsonObject.get("storeNumber");
        System.out.println("storeNumber is " + storeNumber);

        Object orderCreatedDate = jsonObject.get("orderCreatedDate");
        System.out.println("orderCreatedDate is " + orderCreatedDate);

        Object messageAction = jsonObject.get("messageAction");
        System.out.println("messageAction is " + messageAction);

        Object fulfillmentSystem = jsonObject.get("fulfillmentSystem");
        System.out.println("fulfillmentSystem is " + fulfillmentSystem);


    }
}
