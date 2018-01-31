/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
public class StackVector<E> implements Stack<E> {
   
    private ArrayList<E> data;
    
    public StackVector(){
       data = new ArrayList<E>(); 
    }
   public void push(E item){
       data.add(item);
   }
 
   public E pop(){
       return data.remove(size()-1);
   }
   
   public E peek(){
       return data.get(size()-1);
   }
   
   public boolean empty(){
       return size() == 0;
   }
   
   public int size(){
       return data.size();
   }
}
