
package com.example.demo1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	@PostConstruct
	public void TopicServiceInit()
	{
		this.topicRepository.createTable();
	}
	public List<Topic> getAllTopics() {
		return (List<Topic>) this.topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		
		//return (Topic) this.topicRepository.findOne(id);
		return (Topic) this.topicRepository.findByName(id);
	}

	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		this.topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		this.topicRepository.delete(id);;
	}
}
