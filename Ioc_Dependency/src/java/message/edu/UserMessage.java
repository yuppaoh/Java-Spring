/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.edu;

/**
 *
 * @author yup
 */
public class UserMessage {
    private MessageService messageService;

    public UserMessage(MessageService messageService) {
        this.messageService = messageService;
    }
    
    public void send(){
        messageService.sendMessage("Gui tin nhan");
    }
    
}
