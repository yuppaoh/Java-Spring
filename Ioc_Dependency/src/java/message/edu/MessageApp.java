/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.edu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author yup
 */
public class MessageApp {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMessage user = context.getBean("myUser", UserMessage.class);
        user.send();
    }
    
}
