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
public class C_Symbol {

    private C_NT nt;
    private C_T t;
    private C_Epsilon epsilon;
    private C_Search_Symbol srch_Symbol;

    public C_Symbol() {
        this.nt = new C_NT();
        this.t = new C_T();
        this.epsilon = new C_Epsilon();
        this.srch_Symbol = new C_Search_Symbol();
    }
    
    /**
     * Create a Symbol Stablish its Non terminal from left side.
     * @param symbol_str 
     */
    public C_Symbol(String symbol_str) {
        if(symbol_str.compareTo(String.valueOf((char)176)) == 0) {
            this.srch_Symbol = new C_Search_Symbol(symbol_str);
            this.nt = new C_NT();
        }
        else {
            this.nt = new C_NT(symbol_str);
            this.srch_Symbol = new C_Search_Symbol();
        }
        this.t = new C_T();
        this.epsilon = new C_Epsilon();
        
    }

    
    public C_Symbol(C_Symbol smbl) {
        if(!smbl.is_NT_EMPTY()) {
            this.nt = new C_NT(smbl.getNt());
            this.t = new C_T();
            this.epsilon = new C_Epsilon();
        }
        else 
            if(!smbl.is_T_EMPTY()) {
                this.t = new C_T(smbl.getT());
                this.nt = new C_NT();
                this.epsilon = new C_Epsilon();
            }
            else {
                this.epsilon = new C_Epsilon(smbl.getEpsilon());
                this.nt = new C_NT();
                this.t = new C_T();
            }
        this.srch_Symbol = new C_Search_Symbol();
    }
    
    /**
     * @return the nt
     */
    public String getNt() {
        return nt.get_NT();
    }

    /**
     * @return the t
     */
    public String getT() {
        return t.get_T();
    }

    /**
     * Set the corresponding String to Terminal Symbol
     *
     * @param str_T
     */
    public void set_T(String str_T) {
        this.t.set_Atomic_Symbol(str_T);
    }

    /**
     * Set the correponding string to No Terminal Symbol
     *
     * @param str_NT Given String for set to the No terminal Symbol
     */
    public void set_NT(String str_NT) {
        this.nt.set_Atomic_Symbol(str_NT);
    }

    /**
     * @return the epsilon
     */
    public String getEpsilon() {
        return epsilon.getEpsilon();
    }

    /**
     * @param epsilon the epsilon to set
     */
    public void setEpsilon(String s_epsilon) {
        this.epsilon.set_Atomic_Symbol(s_epsilon);
    }

    /**
     * Determine if the Non Terminal Symbol is Empty;
     *
     * @return True if the Non Terminal Symbols is Empty;
     */
    public boolean is_NT_EMPTY() {
        return (0 == this.nt.get_NT().length()) ? true : false;
    }

    /**
     * Determine if the Terminal Symbols is empty;
     *
     * @return True if the TERMINAL symbols do not have anything.
     */
    public boolean is_T_EMPTY() {
        return (this.t.get_T().length() == 0) ? true : false;
    }
    
    public boolean is_Epsilon_Emtpy(){
        return (this.epsilon.getEpsilon().length() == 0) ? true : false;
    }

    public boolean TERMINAL_is_Metacharecter() {
        return this.t.is_META_character();
    }
       

    /**
     * @return the srch_Symbol
     */
    public String get_Srch_Symbol() {
        return this.srch_Symbol.get_Search_Symbol();
    }

    /**
     * @param srch_Symbol the srch_Symbol to set
     */
    public void set_Search_Symbol(String srch_smbl) {
        this.srch_Symbol.set_Atomic_Symbol(srch_smbl);
    }

}
