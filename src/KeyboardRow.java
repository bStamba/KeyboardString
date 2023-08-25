import java.util.ArrayList;

public class KeyboardRow {


    public String[] findWords(String[] words) {

        //Variables
        ArrayList<String> ourWords = new ArrayList<>();
        String tempWord;
        int index = 0;
        boolean row;

        //For each word in our array, we use our helper method to determine if the word can be
        //written with only one row of the keyboard. We return true and add the word to our array
        //if it can be done, otherwise false.
        for(int i = 0; i < words.length; i++){
            tempWord = words[i].toLowerCase();
            row = oneRow(tempWord);
            if(row){
                ourWords.add(words[i]);
            }
        }

        //Copy array list over to our String Array and then return it.
        String[] sArr = new String[ourWords.size()];
        for(String s: ourWords){
            sArr[index] = ourWords.get(index);
            index++;
        }

        return sArr;
    }

    public boolean oneRow(String s){

        ArrayList<String> rows = new ArrayList<>();
        String firstLetter = String.valueOf(s.charAt(0));
        boolean row = false;

        rows.add("qwertyuiop");
        rows.add("asdfghjkl");
        rows.add("zxcvbnm");

        //Top row of keyboard
        if(rows.get(0).contains(firstLetter)){
            for(int i = 0; i < s.length(); i++){
                if(!rows.get(0).contains(String.valueOf(s.charAt(i)))){
                    row = false;
                    break;
                }
                row = true;
            }
        }
        //Middle row of keyboard
        else if(rows.get(1).contains(firstLetter)){
            for(int i = 0; i < s.length(); i++){
                if(!rows.get(1).contains(String.valueOf(s.charAt(i)))){
                    row = false;
                    break;
                }
                row = true;
            }

        }
        //Bottom row of keyboard
        else if(rows.get(2).contains(firstLetter)){
            for(int i = 0; i < s.length(); i++){
                if(!rows.get(2).contains(String.valueOf(s.charAt(i)))){
                    row = false;
                    break;
                }
                row = true;
            }
        }
        return row;
    }
}
