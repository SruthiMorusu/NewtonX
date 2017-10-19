package hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonTransformer 
{
    public static String transformList( List<List<Object>> values ) throws IOException
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	List<StudentDetails> studentList = new ArrayList<StudentDetails>(); 
    	for (List row : values) {
    		StudentDetails temp = new StudentDetails( 
    				(String)row.get(0),
    				(String)row.get(1),
    				(String)row.get(2),
    				(String)row.get(3),
    				(String)row.get(4),
    				(String)row.get(5) );
    		studentList.add(temp);
    	}
    	String arrayToJson = objectMapper.writeValueAsString(studentList);
    	// System.out.println("1. Convert List of person objects to JSON :");
    	// System.out.println(arrayToJson);
/*
    	
    	//1. Convert List of Person objects to JSON
    	
    	//2. Convert JSON to List of Person objects
    	//Define Custom Type reference for List<Person> type
    	
    	//Print list of person objects output using Java 8
    	TypeReference<List<StudentDetails>> mapType = new TypeReference<List<StudentDetails>>() {};
    	List<StudentDetails> jsonTostudentList = objectMapper.readValue(arrayToJson, mapType);
    	jsonToPersonList.forEach(System.out::println);
*/
    	
    	return arrayToJson;
    }
}