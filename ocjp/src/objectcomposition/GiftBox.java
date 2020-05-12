package objectcomposition;
public class GiftBox implements Box {
public void pack() { // from
System.out.println("pack box"); // interface
}
public void seal() { // from
System.out.println("seal box"); // interface
}
}