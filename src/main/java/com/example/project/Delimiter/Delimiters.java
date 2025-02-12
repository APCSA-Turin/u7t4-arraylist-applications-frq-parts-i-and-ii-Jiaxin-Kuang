package com.example.project.Delimiter;
import java.util.ArrayList;
import java.util.List;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimitersList = new ArrayList<String>();
        for(String token : tokens){
            if(token.equals(openDel) || token.equals(closeDel)){
                delimitersList.add(token);
            }
        }
        return delimitersList;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        String[] tokens = delimiters.toArray(new String[0]);
        int openDelCount = 0;
        int closeDelCount = 0;
        ArrayList<String> tokensList = getDelimitersList(tokens);
        for(int i = 0; i < tokensList.size(); i ++){
            if(tokensList.get(i).equals(openDel)){
                openDelCount ++;
            }
            else{
                closeDelCount ++;
            }
            if(openDelCount < closeDelCount){
                return false;
            }
        }
        if(openDelCount == closeDelCount){
            return true;
        }
        else{
            return false;
        }
    }
}
