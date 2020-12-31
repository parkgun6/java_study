package d6;

public class Memo {
String content;

public Memo(String content) {
	super();
	this.content = content;
}

@Override
public String toString() {
	return "Memo [content=" + content + "]";
}

public boolean showResult() {
	
	return this.content.equals("O");
}

}
