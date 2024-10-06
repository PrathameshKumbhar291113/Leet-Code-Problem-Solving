package easy/*

242. Valid Anagram

Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

*/

fun main(){
    var s = "string"
    var t = "car"
    println(isAnagram(s,t))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val countS = IntArray(26)
    val countT = IntArray(26)

    for (i in s.indices){
       countS[s[i] - 'a']++
       countT[t[i] - 'a']++
    }

    return countS.contentEquals(countT)
}