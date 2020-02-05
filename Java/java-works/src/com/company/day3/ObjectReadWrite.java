package com.company.day3;

import java.io.*;

public class ObjectReadWrite {

	public static void storeAccount(Account... accounts) throws IOException {

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("Accounts.ser"));

			oos.writeObject(accounts);
			oos.writeObject(101);
			oos.writeObject("Sapient");
		} catch (IOException e) {

			throw new IOException("Sorry storage Failed", e);
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Object saved");
	}

	public static void readAccount() {

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("Accounts.ser"));

			Account[] accounts = (Account[]) ois.readObject();

			for (Account temp : accounts) {
				System.out.println(temp);
			}

			int x = (int) ois.readObject();
			System.out.println(x);
			String str = (String) ois.readObject();
			System.out.println(str);

		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cce) {
			cce.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String ... args) {
		
		Account account = new Account(101, 1234, "Harry");
		Account account1 = new Account(102, 3333, "Peter");

		
		readAccount();
		
		/*
		 * try { storeAccount(account, account1); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
	}

}
