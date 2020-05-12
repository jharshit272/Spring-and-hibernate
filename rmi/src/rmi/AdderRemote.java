package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
	AdderRemote() throws RemoteException{
		super();
	}

	@Override
	public int add(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x+y;
	}
}
