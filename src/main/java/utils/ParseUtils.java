package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import domain.Person;
import exceptions.ParameterIsNotJsonStringException;

public class ParseUtils {

    public static Person parseJsonToPersonDirect(String jsonString) throws ParameterIsNotJsonStringException{
        if (jsonString.charAt(0) != '{'){
            throw new ParameterIsNotJsonStringException();
        }
        String userJson = "{'firstName':'Huseyin','lastName':'Ergin','birthYear':1986}";
        Gson gson = new Gson();
        Person person = gson.fromJson(userJson,Person.class);
        return person;
    }

    public static Person parseJsonToPersonManual(String jsonString) {
        JsonParser jsonParser = new JsonParser();
        JsonElement rootelement = jsonParser.parse(jsonString);
        JsonObject rootObject = rootelement.getAsJsonObject();
        JsonElement rootElement = jsonParser.parse(jsonString);
        var firstName = rootObject.getAsJsonPrimitive("name").getAsString();
        var lastName = rootObject.getAsJsonPrimitive("last").getAsString();
        var year = rootObject.getAsJsonPrimitive("dob").getAsInt();
        return new Person(firstName, lastName, year);
    }

}
