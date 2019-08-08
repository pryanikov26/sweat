package com.example.sweater.repos;

import org.apache.logging.log4j.message.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {



    List<Message>findByTag(String tag);

}
