package com.bridgelabz.Observer;

public interface InterfaceSubject {
public void register(InterfaceObserver observer);
public void unRegister(InterfaceObserver observer);
public void notifyObserver();
public Object getUpdate(InterfaceObserver observer);
}
