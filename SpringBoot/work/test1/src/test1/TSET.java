package test1;

public class TSET {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5,10,1,3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		int[] answer = new int[photo.length];
	    
	    for(int i = 0; i < photo.length;i++){
	        int num = 0;
	        for(int j  =0; j<photo[i].length;j++){
	            if(photo[i][j]==name[num]){
	                answer[i] += yearning[num];
	                num++;
	            }
	            System.out.println(answer[i]);
	        }
	    }
		
		}
	}


