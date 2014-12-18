/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author 8.1 Enterprise
 */
public class MessageException extends Exception {
    public MessageException(){
        
    }
    public MessageException(String message){
        super(message);
    }
}
