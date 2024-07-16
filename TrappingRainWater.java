import java.util.*;
public class TrappingRainWater 
{
    public static void main(String[] args) 
    {
        int trappedWater = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF INPUT");
        int n =in.nextInt();
        int[] height = new int[n];
        System.out.println("ENTER INPUTS");
        for (int i = 0; i < n; i++) {
            height[i]=in.nextInt();
        }
        if (height == null || height.length < 3) 
        {
        System.out.println("invalid input");
        }
        else
        {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
               int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped = waterTrapped+Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        System.out.println("WATER TRAPPED---->"+waterTrapped);
      }
    }
}

