package easy

/*

206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


Example 2:
Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?


 Example:
 var li = ListNode(5)
 var v = li.`val`
 Definition for singly-linked list.
 class ListNode(var `val`: Int) {
     var next: ListNode? = null
 }


*/

fun main() {

    val head = ListNode(1)/*
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)*/

    println("Original List:")
    printList(head)

    // Reverse the linked list
    val reversedHead = reverseList(head)

    println("Reversed List:")
    printList(reversedHead)

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun reverseList(head: ListNode?): ListNode? {
    var previousNode = head
    var currentNode = head?.next
    var nextNode : ListNode?

    while (currentNode != null){
        nextNode = currentNode.next
        currentNode.next = previousNode

        //update
        previousNode = currentNode
        currentNode = nextNode
    }

    head?.next = null
    return previousNode
}

fun printList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    println("null")
}