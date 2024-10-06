package medium/*

347. Top K Frequent Elements
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/

fun main() {
    val array = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2
    topKFrequent(array, k).forEach {
        print("$it,  ")
    }
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    if (nums.isEmpty()) return emptyArray<Int>().toIntArray()
    val frequencyMap = mutableMapOf<Int, Int>()
    nums.forEach { num ->
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    val bucket = Array<MutableList<Int>>(nums.size +1) { mutableListOf() }
    for ((num, freq) in frequencyMap){
        bucket[freq].add(num)
    }

    val result = mutableListOf<Int>()
    for (i in bucket.size -1 downTo  0){
        if (bucket[i].isNotEmpty()){
            result.addAll(bucket[i])
            if (result.size >= k) break
        }
    }

    return result.take(k).toIntArray()
}