 /* Problem
Bob has a playlist of songs, each song has a singer associated with it (denoted by an integer)

Favourite singer of Bob is the one whose songs are the most on the playlist

Count the number of Favourite Singers of Bob

Input Format 

The first line contains an integer, denoting the number of songs in Bob's playlist.

The following input contains 
 integers, integer denoting the singer of the song.

Output Format

Output a single integer, the number of favourite singers of Bob

Note: Use 64 bit data type

Sample Input
5
1 1 2 2 4

Sample Output
2
*/

import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map <Long, Integer> singerCount = new HashMap<>();
        for (int i=0; i<N; i++){
            long singer = sc.nextLong();
            singerCount.put(singer, singerCount.getOrDefault(singer, 0)+1);
        }
 
        int maxCount = 0;
        for (int count : singerCount.values()){
            if (count > maxCount){
                maxCount = count;
            }
        }
 
        int favSingers = 0;
        for (int count : singerCount.values()){
            if (count == maxCount){
                favSingers++;
            }
        }
        System.out.println(favSingers);
        sc.close();
 
    }
}
