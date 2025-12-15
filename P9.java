
import java.util.*;


public class P9{

	static int [][] puzzle={
	    {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}

	};
	static int blankrow=3,blankcolumn=3;
	static Random rand = new Random();
	public void shufflePuzzle() {
        	char[] moves = {'w', 'a', 's', 'd'}; 
       	 	for (int i = 0; i < 200; i++) {      
           	 	char m = moves[rand.nextInt(4)];
            	 	move(m);                         
        	}
    }
	
	public void print(){

		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(puzzle[i][j]==0){
					System.out.print("_\t");
				}else{
				    System.out.print(puzzle[i][j] + "\t");
	
				}
			}
			System.out.println();
		}

	}


	public void move(char ch){

		int newrow,newcolumn;
		newrow=blankrow;
		newcolumn=blankcolumn;

		switch (ch) {
            		case 'w': newrow--; break; 
            		case 's': newrow++; break;  
            		case 'a': newcolumn--; break;  
            		case 'd': newcolumn++; break;  
            		default:
                		System.out.println("Invalid key! Use W A S D");
                		break;
        	}
		if(newrow<0 || newrow>3 || newcolumn<0 || newcolumn>3){
            		return;
		}

		puzzle[blankrow][blankcolumn] = puzzle[newrow][newcolumn];
        	puzzle[newrow][newcolumn] = 0;
		blankrow = newrow;
        	blankcolumn = newcolumn;
	}

	public boolean isSolved() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 3 && j == 3 && puzzle[i][j] == 0)
                    return true;
                if (puzzle[i][j] != count)
                    return false;
                count++;
            }
        }
        return false;
    }




	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		P9 obj = new P9();
		obj.shufflePuzzle();
		System.out.println("===== 15 Puzzle Game =====");
        	System.out.println("Use keys: W = up, S = down, A = left, D = right");
		obj.print();
		
		while(true){
			System.out.print("Move: ");
            		char ch = sc.next().charAt(0);
			obj.move(ch);
            		obj.print();

			if (obj.isSolved()) {
                		System.out.println("Congratulations! You solved the puzzle!");
                		break;
           		 }
		}
		
	}

}