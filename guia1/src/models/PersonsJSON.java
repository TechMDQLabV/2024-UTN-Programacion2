package models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class PersonsJSON {
    private static final String PATH_RESOURCES = System.getProperty("user.dir")+"/src/resources";
    private static final String PATH_PERSONS = "/persons.json";

    private final Personas personArray = new Personas(1000);

    public PersonsJSON(){
        JSONParser parser = new JSONParser();
        try{
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(PATH_RESOURCES+PATH_PERSONS));

            JSONArray jsonArray = (JSONArray) jsonObject.get("persons");
            for(int i=0;i<jsonArray.size();i++){
                JSONObject jsonPerson = (JSONObject) jsonArray.get(i);
                personArray.cargar((Alumno)new Alumno()
                        .name((String)jsonPerson.get("name"))
                        .lastName((String)jsonPerson.get("last_name")));
            }

        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
    }

    public Personas getPersonas(){
        return personArray;
    }
}
