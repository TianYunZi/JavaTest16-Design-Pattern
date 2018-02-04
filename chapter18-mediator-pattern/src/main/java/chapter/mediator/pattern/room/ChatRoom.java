package chapter.mediator.pattern.room;

import chapter.mediator.pattern.user.User;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
