/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr_1;

import grammar_things.C_Grammar;
import grammar_things.C_Production;
import java.util.Iterator;
import symbol.C_Symbol;

/**
 *
 * @author devcrack
 */
public class C_LR_1 {
    private C_Grammar increased_grammar;
    
    
    /**
     * We creates a new grammar from 
     * @param gram 
     */
    public C_LR_1(C_Grammar gram) {
        this.increased_grammar = new C_Grammar(gram);
        this.make_extended();
    }
    
    /**
     * Append the searcher symbol to the productions.
     */
    private void make_extended() {
        Iterator it  = this.getIncreased_grammar().getGrammar().iterator();
        C_Production tmp_pr;
        C_Symbol searcher_symbol; 
        
        while(it.hasNext()) {
           tmp_pr = (C_Production)it.next();
           searcher_symbol = new C_Symbol(String.valueOf((char)176));
           tmp_pr.getRight().add(0, searcher_symbol);
        }
    }

    /**
     * @return the increased_grammar
     */
    public C_Grammar getIncreased_grammar() {
        return increased_grammar;
    }
    
}
