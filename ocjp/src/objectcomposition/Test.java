package objectcomposition;

public class Test {
public static void main(String[] args) {
	GiftBox box=new GiftBox();
	MailerBox mailerBox=new MailerBox(box);
	mailerBox.seal();
	mailerBox.addPostage();
}
}
