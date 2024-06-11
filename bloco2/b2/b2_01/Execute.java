@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

    @Override 
    public String visitGreetings(HelloParser.GreetingsContext ctx) {
        System.out.print("Olá, " + ctx.ID().getText() + "!");
        return null;
    }

    @Override 
    public String visitBye(HelloParser.ByeContext ctx) {
        System.out.println("Adeus " + ctx.ID().getText() + "!");
        return null;
    }
}
