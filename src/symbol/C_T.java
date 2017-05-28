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
public class C_T extends C_Atomic_Symbol {

    public C_T(){ super(); } 
    
    public C_T(String at_symbol) {
        super(at_symbol);
    }
    /**
     * Gets the terminal 
     * @return 
     */
    public String get_T() {
        return super.get_Atomic_Symbol();
    }
    
    
}
