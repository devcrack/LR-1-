/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammar_things;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import symbol.C_Symbol;

/**
 *
 * @author devcrack
 */
public class C_Production {
    
    private ArrayList<C_Symbol>left;
    private ArrayList<C_Symbol>right;
    
    
    public C_Production()
    {
        this.left = new ArrayList<C_Symbol>();
        this.right = new ArrayList<C_Symbol>();
    }

    /**
     * Create a new Production From a given production that already exists.
     * @param nw_pr 
     */
    public C_Production(C_Production nw_pr) {
        this.left = new ArrayList<C_Symbol>();
        this.right = new ArrayList<C_Symbol>();
        //Stablish the left side of the grammar
        C_Symbol nw_Symbol = new C_Symbol(nw_pr.getLeft());        
        
        this.left.add(nw_Symbol);
        
        Iterator it = nw_pr.getRight().iterator();               
        
        while(it.hasNext()) {           
            nw_Symbol = new C_Symbol((C_Symbol)it.next());
            this.right.add(nw_Symbol);            
        }
    }

    
    public String getLeft() {
        return left.get(0).getNt();
    }
    /**
     * @return the right
     */
    public ArrayList<C_Symbol> getRight() {
        return right;
    }
    
    
    public static boolean check_production(String str)
    {
        String meta_chars = "(\\\\>|\\\\\\\\|\\\\\\||\\\\<)";
        String others = "\\:|;|,|\\.|\\[|\\]|\\*|\\+|\\?|¿|¡|!|#|%|\\&|/|-";
        String t = "(((\\w)+_*(\\w)*|\\(|\\)|(\\w)*_*(\\w)+|\\w|"+ others + ")'?)";
        String NT_right = "(<" + t + "+" + ">)";
        String left_side = "(" + meta_chars + "*" + t  + "+" + "|"+ meta_chars + "+" + t + "*)+";
        Matcher matcher;
        boolean flag;

        if(count_epsilon(str) > 1)
            return false;
        matcher = Pattern.compile("^("+left_side + "->~)$").matcher(str);
        flag = matcher.matches();
        
        if(flag)
            return flag;
        if(str.charAt(str.length() -1) =='|' && str.charAt(str.length() - 2) !='\\'  && str.length() > 1)
            return false ;
        else
        {
            String right_side = "(" +
                    "("+t +"*" + NT_right + "+|" + t +"+" + NT_right + "*)+"+meta_chars + "*"
                    + "|" +
                    "("+t +"*" + NT_right + "+|" + t +"+" + NT_right + "*)*"+meta_chars + "+"+ ")+";
            
            String regex = "^(" + left_side + "->" + right_side + "(\\|("+"~|" + right_side+ ")" + ")*)$"; //regex = "^(" + left_side + "->" + right_side + ")$";

            matcher = Pattern.compile(regex).matcher(str);
            return matcher.matches();
        }
        
        //return false;
    }
    
    private static Integer count_epsilon(String str)
    {
        int cc = 0;
        for(char c: str.toCharArray())
        {
            if(c =='~')
                cc++;
            if(cc>1)
                return cc;
        }
        return cc;
    }
    
    
    /**
     * Load the left side of a production from a given String. 
     * @param str 
     */
    public void ld_production(String str)
    {
        char crrt_symbol = '\0';
        StringBuilder str_blr = new StringBuilder();
        C_Symbol nw_smbl = new C_Symbol();
                
        for(int i = 0; i < str.length(); i++)
        {
            
            crrt_symbol = str.charAt(i);          
            if( (this.is_Metacharecter(crrt_symbol) == true && i > 0 && str.charAt(i - 1) == '\\') || is_valid_symbol(crrt_symbol))
                    str_blr.append(crrt_symbol);
            switch(crrt_symbol)
            {
                case '<':
                    if(i > 0 && str.charAt(i - 1) != '\\' && str_blr.length() > 0) {
                        this.insert_TerminalS(str_blr.toString());
                        str_blr = new StringBuilder();
                    }
                    break;
                case '>':
                    if(i > 0 && str.charAt(i - 1) != '\\') {
                        nw_smbl = new C_Symbol();
                        nw_smbl.set_NT(str_blr.toString());
                        this.right.add(nw_smbl);
                        str_blr = new StringBuilder();
                    }
                    break;
                    default:
                        if(i == (str.length() -1))
                            this.insert_TerminalS(str_blr.toString());
            }
        }
    }
    
    private void insert_TerminalS(String str_terminal)
    {
        C_Symbol nw_smbl = new C_Symbol();
        
         if(str_terminal.charAt(0) == '~')
             nw_smbl.setEpsilon(str_terminal);
         else
             nw_smbl.set_T(str_terminal);
         this.right.add(nw_smbl);
    }
    
    private boolean is_Metacharecter(char c)
    {
        String metacharacters =  "< > | \\\\";
        
        if(metacharacters.contains("" + c + ""))
             return true;
        else 
            return false;
        //return (metacharacters.contains("" + c + "")) ?true : false;
    }   
    
    private boolean is_valid_symbol(char c)
    {
        if(c >= '0' && c <= '9') 
            return true;
        if( (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            return true;
        if(
                c == '\'' || c == '~' || c == '(' || 
                c == ')' || c == ':' || c==';'    ||
                c == ',' || c =='.'|| c =='['     || 
                c==']' || c =='*'|| c=='+'        || 
                c =='?' || c == '-'|| c =='¿'     || 
                c== '¡'||c == '!'||c == '#'       || 
                c == '%' ||c == '&'||c =='/'
          )
            return true;
        return false;
    }
    
    public void set_Left(String str_left) {
        C_Symbol smbl = new C_Symbol();
        
        smbl.set_NT(str_left);
        this.left.add(smbl);
    }
    
    /**
     * Gets the first Symbol if this have it directly.
     * @return The terminal symbol if this have it directly if else returns NULL;
     */
    public C_Symbol get_first_T_Symbol() {
        C_Symbol first_smbl = this.right.get(0);
        return (!first_smbl.is_T_EMPTY() || first_smbl.getEpsilon().contains("~") == true) ? first_smbl : null;
    }
    
    public C_Symbol get_first_NT_Symbol() { return this.right.get(0); }
}
