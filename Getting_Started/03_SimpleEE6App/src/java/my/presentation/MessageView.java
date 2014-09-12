/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.MessageFacade;
import entities.Message;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author aluno
 */
@ManagedBean(name = "MessageView")
@RequestScoped
public class MessageView {
    
    @EJB
    private MessageFacade messageFacade;

    private Message message;
    
    /**
     * Creates a new instance of MessageView
     */
    public MessageView() {
        this.message = new Message();
    }

    // Calls getMessage to retrieve the message
    public Message getMessage (){
        return this.message;
    }
    
    // Returns the total number of messages
    public int getNumberOfMessages(){
        return messageFacade.findAll().size();
    }
    
    // Saves the message and then returns the string "theend"
    public String postMessage(){
        this.messageFacade.create(this.message);
        return "theend";
    }
}
