package com.godsplan.collection;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="allservers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Server {

    @Id
    private String id;
    private String name;
    private String language;
    private String framework;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setID(String id) {
		this.id = id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}

}
