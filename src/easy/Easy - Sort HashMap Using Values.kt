package easy

fun main() {


/**
    Question: Sort the hashmap according to the values

    Sorting of Hashmap:
    Usually the sorting of the hashmap is done with the keys.
    But here we have to perform sorting of the hashmap with the help of the values not the keys
    below is the way how to do it.
*/

    val hashMap = HashMap<Int, String>()
    hashMap[1] = "animal"
    hashMap[5] = "cow"
    hashMap[3] = "dog"
    hashMap[4] = "cat"

    println(sortingOfHashMap(hashMap))

    //output - animal = 1, cat = 4, cow =5, dog = 3
}

fun sortingOfHashMap(hashMap: HashMap<Int, String>): HashMap<String, List<Int>> {
    val sortedList = hashMap.toSortedMap()
    val result = HashMap<String, List<Int>>()

    var currentKey: String? = null
    var keysList = mutableListOf<Int>()

    for ((key, value) in sortedList) {
        if (value != currentKey) {
            if (currentKey != null) {
                result[currentKey] = keysList
            }
            currentKey = value
            keysList = mutableListOf(key)
        } else {
            keysList.add(key)
        }
    }
    if (currentKey != null) {
        result[currentKey] = keysList
    }

    return result
}