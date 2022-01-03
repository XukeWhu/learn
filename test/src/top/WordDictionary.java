package top;

public class WordDictionary {
	private WordDictionary [] children;
	private boolean isend;
	public WordDictionary() {
		children=new WordDictionary[26];
		isend=false;
    }
    
    public void addWord(String word) {
    	WordDictionary node=this;
    	for(int i=0;i<word.length();i++) {
    		int index=word.charAt(i)-'a';
    		if(node.children[index]==null)node.children[index]=new WordDictionary();
    		node=node.children[index];
    	}
    	node.isend=true;
    }
    
    public boolean search(String word) {
    	return searchnext(this,word,0);
    }
    public boolean searchnext(WordDictionary wnode,String word,int start) {
    	if(word.length()==start&&wnode.isend)return true;
    	WordDictionary node=wnode;
    	for(int i=start;i<word.length();i++) {
    		if(word.charAt(i)=='.') {
    			for(int j=0;j<26;j++) {
    				if(node.children[j]!=null&&searchnext(node.children[j],word,i+1))return true;
    			}
    			return false;
    		}
    		int index=word.charAt(i)-'a';
    		if(node.children[index]==null)return false;
    		node=node.children[index];
    	}
    	if(node.isend)return true;
    	return false;
    }
}
