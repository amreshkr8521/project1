package com.bridgelabz.AddressBook;

import org.json.simple.JSONObject;
/**
 * Essential methods to be used by all the class which implements this interface
 * 
 * @author amresh kumar
 * @since  5-12-2019
 *
 */
public interface Services {

public void Open(String FilePath);
public void Close(String filePath, JSONObject jsonObject);
public void New();
public void Save(String filePath);
}
