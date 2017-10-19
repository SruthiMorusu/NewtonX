package hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class StudentService {
    public static String getStudentData( String json, String studentName )throws IOException{
    	ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of JSon
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	
    	TypeReference<List<StudentDetails>> mapType = new TypeReference<List<StudentDetails>>() {};
    	List<StudentDetails> jsonToStudentList = objectMapper.readValue(json, mapType);
    	System.out.println("\n2. Convert JSON to List of person objects :");
        
    	// Creating a list of objects that match with student name
    	// This helps capture all the matching objects instead of just 
    	// the last object
    	// Currently returning only first object to keep the output
    	// as JSon object instead of a JSon Array
    	List<StudentDetails> result = new ArrayList<StudentDetails>();
    	int found = 0;
    	//System.out.println( "Looking for name:" + studentName );
    	for (StudentDetails val: jsonToStudentList) {
        	// search for given student name in the object
    		System.out.println( val.studentname);
    		if(val.studentname.equals(studentName)){
    			result.add(val);
    			found = 1;
    		}
    	}
    	if( found == 1 )
    		return objectMapper.writeValueAsString(result.get(0));
		else
			return "Can't find the Student Name";
    }
}
