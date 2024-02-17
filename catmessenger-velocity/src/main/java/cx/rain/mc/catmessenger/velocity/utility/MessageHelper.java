package cx.rain.mc.catmessenger.velocity.utility;

import cx.rain.mc.catmessenger.message.AbstractMessage;
import cx.rain.mc.catmessenger.message.MessageColor;
import cx.rain.mc.catmessenger.message.type.TextMessage;

public class MessageHelper {
    public static AbstractMessage buildServerOnlineMessage() {
        var message = new TextMessage("服务器上线了");
        message.setBold(true);
        message.setColor(MessageColor.YELLOW);
        return message;
    }

    public static AbstractMessage buildServerOfflineMessage() {
        var message = new TextMessage("服务器离线了");
        message.setBold(true);
        message.setColor(MessageColor.YELLOW);
        return message;
    }
}