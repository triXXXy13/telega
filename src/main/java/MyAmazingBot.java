import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;


public class MyAmazingBot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {
         if(update.hasMessage() && update.getMessage().hasText()){
             String message_text = update.getMessage().getText();
             long chat_id = update.getMessage().getChatId();
             SendMessage message = new SendMessage()
                     .setChatId(chat_id)
                     .setText(message_text);
             try{
                 execute(message);
             } catch (TelegramApiException e){
                 e.printStackTrace();
             }
         }
    }

    public String getBotUsername() {
        return "TheByteFoxBot";
    }

    public String getBotToken() {
        return "1376500093:AAFNVrrpsqLXOb5zmhvSQGl33fGK_7COxZE";
    }
}
