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
public class C_Search_Symbol extends C_Atomic_Symbol{
    
    public C_Search_Symbol() {
        super();
    }
    
    public C_Search_Symbol(String srch_smbl) {
        super(srch_smbl);
    }
    
    public String get_Search_Symbol(){return super.get_Atomic_Symbol();}
   
}
