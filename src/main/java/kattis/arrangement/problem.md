https://open.kattis.com/problems/upprodun

One of the things that programming competition organizers have to do is decide which team should be in which room. There are N rooms and M teams. The rooms are similar in size, so it is best for teams to be divided into rooms as evenly as possible. For example, if there are N=3 rooms and M=8 teams, then it is best to put 3 teams in one room, 3 teams in another room, and then the last 2 teams in the last room.

Input
The input consists of two lines. On the first line is an integer N, and on the second line is an integer M.

Output
The output should contain N lines, one for each room. If k teams are to be in room number i, then line i should contain k copies of the * symbol.

Explanation of sample cases
The first sample is N=1 rooms and M=5 teams. Since there is only one room, all the teams are in that room.

The second sample is the same as the one taken above.

In the third sample, there are N=5 lounges and M=33 teams. Here it is best to put 6 teams in two of the rooms, and 7 teams in the other three rooms. Here we also see that order does not matter.

Scoring
Your solution will be tested on different input data, which is divided into groups as shown in the table below. The solution will then receive points depending on which groups are solved.

Group

Points

Input size

Other conditions

1

20

N=1, M≤500


2

20

N=2, M≤500


3

30

N≤10, M≤500

There will be the same number in each room.

4

30

N≤10, M≤500

 
