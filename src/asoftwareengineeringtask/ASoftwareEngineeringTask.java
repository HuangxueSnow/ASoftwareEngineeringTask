/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asoftwareengineeringtask;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ASoftwareEngineeringTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader=new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        char[][] input = new char [n][m];
        System.out.println();
        for(int i = 0; i < n; i++){
            String in = reader.nextLine();
            for(int j = 0; j < m; j++){
                input[i][j] = in.charAt(j);
            }
        }
        for (int i=0; i < 100; i++) {
            ChangeFine(input,n,m);
        }
        for (int i = 0 ; i < n; i++) {
            for (int j = 0;j < m; j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }

    private static void ChangeFine(char[][] input, int n, int m) {
        for (int l =0; l < n-1 ; l++) {
            for (int l = 0 ;l < m; l++) {
                if (input[l][l] == 'o' && input[l+1][l]== '.') {
                    input[l][l]='.';
                    input[l+1][l]='o';
                }
            }
        }
    }
    
}
