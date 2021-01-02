package com.pruebaexamplei.examplepruebai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

   private List<Topic> topics= new ArrayList<>(Arrays.asList(
            new Topic("Spring","Spring Framework","Spring F Descrip"),
            new Topic("Java","Java Framework","Java F Descrip"),
            new Topic("JavaScript","JavaScript Framework","JavaScript F Descrip"),
            new Topic("Eclipse","Eclipse Framework","Eclipse F Descrip")
    ));
    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id)
    {
       return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
	public void add(Topic topic) {
        topics.add(topic);
	}
}
