package org.srs.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.srs.models.Job;
import org.srs.models.Person;
//? super R, ? extends V
public class FunctionSpplyExample01 {
	
	
	public static void main(String[] args) {
	    Function<Integer,String> converter = (i)-> Integer.toString(i);
	    
	   
	    System.out.println(converter.apply(3).length());
	    System.out.println(converter.apply(30).length());
	  }
	
	
	
	Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {
		public Job apply(Person person) {
			Job job = new Job(person.getPersonId(), person.getJobDescription());
			return job;
		}
	};
	
	
	List<Person> persons = Arrays.asList(
			new Person(1, "Husband"),
            new Person(2, "Dad"), 
            new Person(3, "Software engineer"),
            new Person(4, "Adjunct instructor"), 
            new Person(5, "Pepperoni hanger"));

    List<Job> jobs = persons.stream().map(mapPersonToJob).collect(Collectors.toList());
    
    public void apply() {

        Person person = new Person(1, "Description");

        Job job = mapPersonToJob.apply(person);

        
    }
}
