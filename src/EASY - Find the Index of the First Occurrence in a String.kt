fun main() {

    //easy level question : Find the index of the first occurrence in a string

    //Example 1:

    //Input: haystack = "sadbutsad", needle = "sad"
    //Output: 0
    //Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.


    //Example 2:

    //Input: haystack = "leetcode", needle = "leeto"
    //Output: -1
    //Explanation: "leeto" did not occur in "leetcode", so we return -1.

    val string = "   hellooo hellll world    "
    val subString = "mybro"
    var index = -1
    index = string.trim().indexOf(subString)
    println(index)


}