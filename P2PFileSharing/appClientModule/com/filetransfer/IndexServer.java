package com.filetransfer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class IndexServer {

	public static void main(String[] args) throws RemoteException {
			Registry registry = LocateRegistry.createRegistry(3455);
			 IndexServerImpl isImpl = new IndexServerImpl();
			 IndexServerInterface isInter = (IndexServerInterface)UnicastRemoteObject.exportObject(isImpl, 0);
			 registry.rebind("Indexing", isInter);
			 System.out.println("Server is up and Running.");
	}
}
