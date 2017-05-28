/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr.pkg1;

import grammar_things.C_Grammar;
import grammar_things.C_Production;
import java.util.Iterator;
import symbol.C_Symbol;

/**
 *
 * @author devcrack
 */
public class lr_1 {
    C_Grammar increased_grammar;
    
    public lr_1(C_Grammar gram) {
        this.increased_grammar = new C_Grammar(gram);
        this.make_extended();
    }
    
    /**
     * Append the searcher symbol
     */
    private void make_extended() {
        Iterator it  = this.increased_grammar.getGrammar().iterator();
        C_Production tmp_pr;
        C_Symbol searcher_symbol; 
        
        while(it.hasNext()) {
           tmp_pr = (C_Production)it.next();
           searcher_symbol = new C_Symbol(".");
           tmp_pr.getRight().add(0, searcher_symbol);
        }
    }
    
}
