package task_2;

public class GiftMail implements MailCode {
  private static final String TEMPLATE = "BLACK FRIDAY! %NAME come and get your gift right now!";
  
  @Override
  public String generate(Client client) {
    return TEMPLATE.replaceAll("%NAME", client.getName());
  }
}
