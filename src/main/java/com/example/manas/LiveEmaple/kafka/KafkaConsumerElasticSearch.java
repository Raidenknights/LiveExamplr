package com.example.manas.LiveEmaple.kafka;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.stereotype.Component;

import com.example.manas.LiveEmaple.kafka.model.Truck;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class KafkaConsumerElasticSearch {

	public static RestHighLevelClient createClient() {

		return new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
	}

	public String connectToElasticSearch(String message) throws IOException {

		RestHighLevelClient client = createClient();
		var request = new IndexRequest("firsttime");
		var truck = new ObjectMapper().readValue(message, Truck.class);
		request.id(truck.getTruckNumber());
		request.source(message, XContentType.JSON);

		IndexResponse response = client.index(request, RequestOptions.DEFAULT);
		return response.getId();
	}

}
