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
public class C_Epsilon extends C_Atomic_Symbol{
    private char epsilon;
    
    public C_Epsilon() { super(); }
    
    public C_Epsilon(String at_symbol){
        super(at_symbol);
    }
            
    
    /** Get this symbol basically ~
     * @return the epsilon
     */
    public String getEpsilon() {
        return super.get_Atomic_Symbol();
    }
}
