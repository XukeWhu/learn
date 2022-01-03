package test;

public class offer33 {
    public boolean istree(int[] postorder,int i,int j){
    	if(i>=j)return true;
    	int p=i;
    	while(postorder[p]<postorder[j])p++;
    	int m=p;
    	while(postorder[p]>postorder[j])p++;
    	return p==j&&istree(postorder,i,m-1)&&istree(postorder,m,j-1);
    }
    public boolean verifyPostorder(int[] postorder) {
    	return istree(postorder,0,postorder.length-1);
    }
}
