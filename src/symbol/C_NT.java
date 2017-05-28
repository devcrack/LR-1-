/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbol;

/**
 *
 * @author devcrack
 */
public class C_NT extends C_Atomic_Symbol{
 
    public C_NT(){ 
        super();
    } 
    
    public String get_NT() {
        return super.get_Atomic_Symbol();
    }
    
    public C_NT(String at_symbol) {
        super(at_symbol);
    }
}
