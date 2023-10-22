package com.avanish.learning.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "student")
public class Student {
	@Id
	private String id;
	private String name;
	
}
