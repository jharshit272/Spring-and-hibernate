package objectcomposition;

public class MailerBox implements Box, Mailer {
	private Box box;
	public MailerBox(Box box) { // pass in a Box
		this.box = box;
	}
	public void pack() { // from Box
		box.pack(); // delegate to box
	}
	public void seal() { // from Box
		box.seal(); // delegate to box
	}
	public void addPostage() { // from Mailer
		System.out.println("affix stamps");
	}
	public void ship() { // from Mailer
		System.out.println("put in mailbox");
	}
}