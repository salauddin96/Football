# Football
Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not. Input The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does not exceed 100 characters. There's at least one player from each team present on the field. Output Print "YES" if the situation is dangerous. Otherwise, print "NO".

Here's how the code works:

Read the input string from the user.

Define a function isDangerous that takes the input string as an argument.

Initialize counters consecutiveZeros and consecutiveOnes to keep track of consecutive players of each team.

Iterate through the input string character by character.

If the character is '0', increment consecutiveZeros and reset consecutiveOnes to 0. If the character is '1', increment consecutiveOnes and reset consecutiveZeros to 0.

Check if there are seven or more consecutive players of the same team (consecutiveZeros >= 7 or consecutiveOnes >= 7). If so, return true indicating a dangerous situation.

If the loop completes without finding a dangerous situation, return false.

In the main function, call isDangerous with the input string and print "YES" if it returns true, indicating a dangerous situation, or "NO" otherwise.
