import java.util.Scanner;
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        int rookXPosition = a;
        int rookYPosition = b;
        int bishopXPosition = c;
        int bishopYPosition = d; 
        int queenXPosition = e;
        int queenYPosition = f;
        
        int result = 2;
                
        int tempRookXPosition = rookXPosition;
        int tempRookYPosition = rookYPosition;
        
        while (tempRookXPosition <= 8) {
            if (tempRookXPosition == bishopXPosition && tempRookYPosition == bishopYPosition) {
                break;
            }
            if (tempRookXPosition == queenXPosition && tempRookYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempRookXPosition++;
        }
        
        tempRookXPosition = rookXPosition;
        tempRookYPosition = rookYPosition;
        
        while (tempRookXPosition >= 1) {
            if (tempRookXPosition == bishopXPosition && tempRookYPosition == bishopYPosition) {
                break;
            }
            if (tempRookXPosition == queenXPosition && tempRookYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempRookXPosition--;
        }
                
        tempRookXPosition = rookXPosition;
        tempRookYPosition = rookYPosition;
        
        while (tempRookYPosition <= 8) {
            if (tempRookXPosition == bishopXPosition && tempRookYPosition == bishopYPosition) {
                break;
            }
            if (tempRookXPosition == queenXPosition && tempRookYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempRookYPosition++;
        }
        
        tempRookXPosition = rookXPosition;
        tempRookYPosition = rookYPosition;
        
        while (tempRookYPosition >= 1) {
            if (tempRookXPosition == bishopXPosition && tempRookYPosition == bishopYPosition) {
                break;
            }
            if (tempRookXPosition == queenXPosition && tempRookYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempRookYPosition--;
        }
        
        int tempBishopXPosition = bishopXPosition;
        int tempBishopYPosition = bishopYPosition;
        
        while (tempBishopXPosition >= 1 || tempBishopYPosition >= 1) {
            if (tempBishopXPosition == rookXPosition && tempBishopYPosition == rookYPosition) {
                break;
            }
            if (tempBishopXPosition == queenXPosition && tempBishopYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempBishopXPosition--;
            tempBishopYPosition--;
        }  
        
        tempBishopXPosition = bishopXPosition;
        tempBishopYPosition = bishopYPosition;
        
        while (tempBishopXPosition <= 8 || tempBishopYPosition <= 8) {
            if (tempBishopXPosition == rookXPosition && tempBishopYPosition == rookYPosition) {
                break;
            }
            if (tempBishopXPosition == queenXPosition && tempBishopYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempBishopXPosition++;
            tempBishopYPosition++;
        } 
        
        tempBishopXPosition = bishopXPosition;
        tempBishopYPosition = bishopYPosition;
        
        while (tempBishopXPosition >= 1 || tempBishopYPosition <= 8) {
            if (tempBishopXPosition == rookXPosition && tempBishopYPosition == rookYPosition) {
                break;
            }
            if (tempBishopXPosition == queenXPosition && tempBishopYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempBishopXPosition--;
            tempBishopYPosition++;
        }  
        
        tempBishopXPosition = bishopXPosition;
        tempBishopYPosition = bishopYPosition;
        
        while (tempBishopXPosition <= 8 || tempBishopYPosition >= 1) {
            if (tempBishopXPosition == rookXPosition && tempBishopYPosition == rookYPosition) {
                break;
            }
            if (tempBishopXPosition == queenXPosition && tempBishopYPosition == queenYPosition) {
                result = Math.min(result, 1);
            }
            tempBishopXPosition++;
            tempBishopYPosition--;
        } 
        
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input format is: a b c d e f
        int a = scanner.nextInt(); // Rook's x position
        int b = scanner.nextInt(); // Rook's y position
        int c = scanner.nextInt(); // Bishop's x position
        int d = scanner.nextInt(); // Bishop's y position
        int e = scanner.nextInt(); // Queen's x position
        int f = scanner.nextInt(); // Queen's y position

        Solution solution = new Solution();
        int result = solution.minMovesToCaptureTheQueen(a, b, c, d, e, f);

        System.out.println(result);
    }
}