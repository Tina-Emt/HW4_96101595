package Broker;

import Util.ThreadManager;

import java.util.HashMap;
import java.util.Map;

public class MessageBroker {
    private Map<String, Topic> topics = new HashMap<>();

    private void addTopic(String name) {

            topics.put(name, new Topic(name));

    }

    public void put(String topic, String producerName, int value) {


    }

    public int get(String topic, String groupName, String consumerName) throws NoSuchTopicException {

            if(!topics.containsKey(topic))
                throw new NoSuchTopicException(topic);

            return topics.get(topic).get(groupName,consumerName);





    }
}
