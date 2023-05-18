import com.matulrich.di.model.Client;
import com.matulrich.di.notification.EmailNotification;
import com.matulrich.di.notification.Notification;
import com.matulrich.di.service.ActiveClientService;

public class Main {
    public static void main(String[] args) {

        Notification notification = new EmailNotification();

        Client joao = new Client("João", "joão@gmail.com", "992959493");
        Client maria = new Client("Maria", "maria@gmail.com", "3456246678");

        ActiveClientService activeClient = new ActiveClientService(notification);
        activeClient.active(joao);
        activeClient.active(maria);
    }

}