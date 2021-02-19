package com.fabrick.exercise.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Configuration
public class FabrickRestClientConfig {
	
	@Value("${baseUrl}")
	private String baseUrl;
	
	@Value("${authSchema}")
	private String authSchema;
	
	@Value("${apiKey}")
	private String apiKey;
	
		
    private RestTemplate restTemplate;
    
    private HttpHeaders headers;
    
    public String getBaseUrl()
    {
    	return this.baseUrl;
    }    
    
    @Bean
	public void setRestTemplate() {
		this.restTemplate =new RestTemplate();
	}
    
    public RestTemplate getRestTemplate() {
		return this.restTemplate ;
	}
    
	public HttpHeaders getHeaders() {
		return headers;
	}

	@Bean
	public void setHeaders(){
		this.headers = new HttpHeaders();
		this.headers.setContentType(MediaType.APPLICATION_JSON);	
		this.headers.add("Auth-Schema", authSchema);
		this.headers.add("Api-Key", apiKey);		
	}
    
   
}
