/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.example.demo1;

/**
 * @author himanshu
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return this.topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return this.topicService.getTopic(id);
	}

	// @PostMapping("/topics")
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public String addTopic(@RequestBody Topic topic) {
		this.topicService.addTopic(topic);
		String response = "{\"success\": true, \"message\": Topic has been added successfully.}";
		return response;
	}

	// @PutMapping("/topics/{id}")
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		this.topicService.updateTopic(id, topic);
		String response = "{\"success\": true, \"message\": Topic has been updated successfully.}";
		return response;
	}

	// @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	@DeleteMapping("/topics/{id}")
	public String deleteTopic(@PathVariable String id) {
		this.topicService.deleteTopic(id);
		String response = "{\"success\": true, \"message\": Topic has been deleted successfully.}";
		return response;
	}
}
