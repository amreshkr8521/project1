package com.bridgelabz.Observer;

public class TopicSubscriber  implements InterfaceObserver{
  private String name="";
 private InterfaceSubject topic;
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	
		
	}

	@Override
	public void setSubject(InterfaceSubject subject) {
		this.topic=subject;
		
	}
	
	public TopicSubscriber(String topic) {
		this.name=topic;
	}

	

}
