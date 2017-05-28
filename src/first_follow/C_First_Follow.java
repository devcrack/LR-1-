/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_follow;

import grammar_things.C_Grammar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import symbol.C_Symbol;

/**
 *
 * @author devcrack
 */
public class C_First_Follow {
    
    /**
     * This hash map is for store the Sets for First, Where the key is the Non Terminal and its value is a list of symbols that belong to this sets.
     */
    private HashMap<String, ArrayList<C_Symbol>> first_set;
    /**
     * Reference to the grammar previously loaded.
     */
    C_Grammar grammar;
    
    
    
    /**
     * Few to moment, Initalize a Firts set in function of the number of productions;
     * @param nmr_trmls Number of productions that do not repeat in the grammar;
     */
    public C_First_Follow(C_Grammar g) {
        this.grammar = g;
        
        Iterator it = g.get_Non_Terminals().iterator();
        
        this.first_set = new HashMap<String,ArrayList<C_Symbol>>();        
        while(it.hasNext()) //Initialize sets for all non terminals.
            first_set.put((String) it.next(),new ArrayList<C_Symbol>());
    }
     
    private Map.Entry srch_entry_in_FS(String aKey)
    {
        Iterator iterator = this.getFirst_set().entrySet().iterator();
        Map.Entry entry = null;
        
        while(iterator.hasNext()){
            entry = (Map.Entry)iterator.next();
            if(((String)entry.getKey()).compareTo(aKey) == 0)
                return entry;
        }
        return entry;
    }
    
    /**
     * Calculate the Entire First Set for the grammar.
     */
    public void calculate_first_set() {
        ArrayList<Integer>indexs = new ArrayList<Integer>();
        C_Symbol first_symbol;        
        HashMap<String, ArrayList<Integer>> sets_indexs = this.get_First_Setp1();        
        ArrayList<Integer>list_to_BAN;
        boolean finish = false;
        boolean insert_ban_lst = true;
        Iterator set_index_It;
        if(sets_indexs.size() > 0)
        {
            while(!finish) {
                set_index_It = sets_indexs.entrySet().iterator();
                while(set_index_It.hasNext()){
                    Map.Entry entry = (Map.Entry)set_index_It.next();//Traveling in the list of index that lack to be analyzed.
                    Map.Entry entry_set_first_to_SET = this.srch_entry_in_FS((String)entry.getKey()); //Getting the entry of the First set for to be stablish.
                    
                    list_to_BAN = new ArrayList<Integer>();            
                    for(int i : (ArrayList<Integer>)entry.getValue()) {
                        first_symbol = this.grammar.get_First_Symbol(i); //Get the first symbol that lack analized.                
                        Map.Entry entry_first_set = this.srch_entry_in_FS(first_symbol.getNt());//Getting the entry of the First set that contains the symbols.                                
                        if(!((ArrayList<C_Symbol>)entry_first_set.getValue()).isEmpty()) { //We check that don't be an empty set.                                     
                            /**Determining if this entry have to be banned of the list
                             *********************************************************/                          
                            //1.Get the entry that of the list of the indexs and if can insert in the first set.
                            insert_ban_lst = true;
                            Map.Entry tmp_entry = null; 
                            if(sets_indexs.containsKey(first_symbol.getNt()))
                            {
                                Iterator tmp_it  =  sets_indexs.entrySet().iterator();
                                
                            
                                while(tmp_it.hasNext()) {
                                    tmp_entry = (Map.Entry)tmp_it.next();
                                
                                    if(((String)tmp_entry.getKey()).compareTo(first_symbol.getNt()) == 0 )
                                        if(((ArrayList<Integer>)tmp_entry .getValue()).size() > 0) {
                                            insert_ban_lst = false;
                                            break;
                                        }
                                }
                            }                            
                            if(insert_ban_lst) {
                                if(((String)entry_set_first_to_SET.getKey()).compareTo((String)entry_first_set.getKey()) != 0) 
                                for(C_Symbol symbol : (ArrayList<C_Symbol>)entry_first_set.getValue()) //Start to fill the current set 
                                    ((ArrayList<C_Symbol>)entry_set_first_to_SET.getValue()).add(symbol);     
                                list_to_BAN.add(i);
                            }
                                
                        }                
                    }
                    for(int i : list_to_BAN) 
                        ((ArrayList<Integer>)entry.getValue()).remove((Object)i);                
                }
                set_index_It = sets_indexs.entrySet().iterator();
                while(set_index_It.hasNext()) {
                    Map.Entry entry = (Map.Entry)set_index_It.next();
                    if(!((ArrayList<Integer>)entry.getValue()).isEmpty()) {
                        finish = false;
                        break;
                    }
                    else
                        finish = true;
                }                
            }
        }
    }
    
    /**
     * Fills by first time the sets of the productions that have a first symbol directly, in other words 
     * gets the first symbol in the production just if this is a Terminal.
     * @return A List with the indexs of the list of productions that has not been analyze.
     */
    
    private HashMap<String, ArrayList<Integer>> get_First_Setp1() {
        Iterator map_iterator;        
        HashMap<String, ArrayList<Integer>> sets_indexs = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer>indexs = new ArrayList<Integer>();
        C_Symbol first_symbol;
        map_iterator = this.getFirst_set().entrySet().iterator();
        while(map_iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) map_iterator.next();//Get an entry of the hashmap
//            sets_indexs.put((String)entry.getKey(), new ArrayList<Integer>());//Initilize the the Hashmap for store the indexs of the sets.
            indexs = this.grammar.get_indexs((String) entry.getKey()); // Get the indexs to this NonTerminal
            for(int i : indexs) {
                first_symbol = this.grammar.get_First(i);//Getting the first Symbol if have directly.
                if(first_symbol !=null)
                    ((ArrayList<C_Symbol>)entry.getValue()).add(first_symbol);                    
                else {
                    if(sets_indexs.containsKey(entry.getKey()) == false) 
                        sets_indexs.put((String)entry.getKey(), new ArrayList<Integer>());//Initilize the the Hashmap for store the indexs of the sets.                                       
                    sets_indexs.get((String)entry.getKey()).add(i);
                }
                    
            }
        }
        return sets_indexs;
    }

    /**
     * @return the first_set
     */
    public HashMap<String, ArrayList<C_Symbol>> getFirst_set() {
        return first_set;
    }
    
    public int get_Max_Numberof_Symbol() {
        Iterator iterator = this.first_set.entrySet().iterator();
        Map.Entry entry;
        int max = 0;
        int crrt;
        while(iterator.hasNext()) {
            entry = (Map.Entry)iterator.next();
            crrt =  ((ArrayList<C_Symbol>)entry.getValue()).size();
            max = (crrt > max) ? crrt : max;
        }
        return max;         
    }
}

/**List of songs for programming 

* 1.  Join Us - Wally_Gagel_Xandy_Barry
* 2.  Shake It Up - Wally Gagel
* 3.  We Work Hard but Party Harder - Chris Constantinou
* 4.  Darkness Makes The Heart  Grow Stronger  -  
 **/