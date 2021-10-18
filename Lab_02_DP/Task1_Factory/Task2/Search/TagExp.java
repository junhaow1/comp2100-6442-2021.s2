package Task1_Factory.Task2.Search;

public class TagExp extends  Exp{
    private String tagContent;

    public TagExp(String tagContent) {
        this.tagContent = tagContent;
    }

    public Token getToken(){
        return new Token(tagContent, Token.Type.TAG);
    }

    public String getValue(){
        return tagContent;
    }


    @Override
    public String show() {
        return tagContent;
    }

    @Override
    public int evaluate() {
        return 0;
    }
}
