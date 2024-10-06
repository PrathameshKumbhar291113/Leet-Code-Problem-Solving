package concept

class LinkList {
    var head: Node? = null
    var linkListSize = 0

    init {
        linkListSize = 0
    }

    inner class Node(var data: String) {
        var next: Node? = null
        init {
            linkListSize++
        }
    }

    //add first or last (if ask in question by default solve for add last)
    fun addFirst(data: String) {
        var newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        newNode.next = head
        head = newNode
    }

    fun addLast(data: String) {
        var newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        var currentNode = head
        while (currentNode?.next != null) {
            currentNode = currentNode.next
        }

        currentNode?.next = newNode

    }

    fun printList() {
        if (head == null) {
            print("List is empty")
            return
        }
        var currentNode = head
        while (currentNode != null) {
            print("${currentNode.data} -> ")
            currentNode = currentNode.next
        }

        print("null")
    }

    fun deleteFirst() {

        if (head?.next == null) {
            println("list is empty")
            return
        }
        head = head?.next
        linkListSize--
    }

    fun deleteLast() {

        if (head == null) {
            println("list is empty")
            return
        }
        linkListSize--
        if (head?.next == null) {
            head = null
            return
        }
        var secondLastNode = head
        var lastNode = head?.next
        while (lastNode?.next != null) {
            lastNode  = lastNode.next
            secondLastNode = secondLastNode?.next
        }

        secondLastNode?.next = null

    }

    fun getSizeOfLinkListSize(): Int{
        return linkListSize
    }
}

fun main() {
    var linkList = LinkList()
    linkList.addFirst("1")
    linkList.addLast("4")
    linkList.addLast("3")
    linkList.printList()
    println()
    println("Link List size ${linkList.getSizeOfLinkListSize()}")
    println()

    linkList.addLast("u")
    linkList.printList()
    println()
    println("Link List size ${linkList.getSizeOfLinkListSize()}")
    println()

    linkList.deleteFirst()
    linkList.printList()
    println()
    println("Link List size ${linkList.getSizeOfLinkListSize()}")
    println()

    linkList.deleteLast()
    linkList.printList()
    println()
    println("Link List size ${linkList.getSizeOfLinkListSize()}")
}

