package Consumer;

import Broker.MessageBroker;
import Broker.NoSuchTopicException;
import Util.ThreadManager;

public class Consumer extends Thread {

    private ConsumerGroup consumerGroup;
    private String consumerName;

    Consumer(ConsumerGroup consumerGroup, String consumerName) {
        this.consumerGroup = consumerGroup;
        this.consumerName = consumerName;
    }

    public int get() throws NoSuchTopicException {

        return getMessageBroker().get(getTopicName(), consumerGroup.getGroupName(), consumerName);
    }

    public void run() {


        while(ThreadManager.lockAllConsumers){
            /*
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             */
        }



        //this.notify();

        while(true) {
            try {
                consumerGroup.performAction(this, get());
            } catch (NoSuchTopicException e) {
                e.printStackTrace();
            }
        }
    }

    public MessageBroker getMessageBroker() {
        return consumerGroup.getMessageBroker();
    }
    public String getConsumerName() {
        return consumerName;
    }
    public String getTopicName() { return consumerGroup.getTopicName();    }
}
