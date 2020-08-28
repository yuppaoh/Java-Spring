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
public class SmsMessage implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println("SMS Message " + message);
    }
    
}
