package com.example.demo1;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	

    @Query("Select * from topic where name=?0 ALLOW FILTERING")
    public Topic findByName(String name);

    @Query("CREATE TABLE IF NOT EXISTS topic (id text PRIMARY KEY, name text, description text)")
    public void createTable();    
    
    
    //@Query("Select * from customer where lastname=?0")
    //public List<Topic> findByLastName(String lastName);

}





