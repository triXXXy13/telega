import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
       update.getUpdateId();
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        if(update.getMessage().getText().equals("Привет")){
            sendMessage.setText("Привет дружище!");
            try{
                execute(sendMessage);}
            catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return "@TheByteFoxBot";
    }

    public String getBotToken() {
        return "1376500093:AAFNVrrpsqLXOb5zmhvSQGl33fGK_7COxZE";
    }
}
