package br.com.alldirect.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class GrowlView {
    
    private String message;
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public void saveMessage(){
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage("Parabéns", "texto digitado" + message));
        context.addMessage(null, new FacesMessage("Segunda Mensagem", "Aqui você tem que adicionar outra mensagem"));
    }
    
}
