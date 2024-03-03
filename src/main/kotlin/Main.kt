

fun main() {
    LinkList.addLast(10)
    LinkList.addFirst(20)
    LinkList.addLast(30)
    LinkList.indexOf(10)
    LinkList.indexOf(20)
    LinkList.indexOf(30)
    LinkList.removeFirst()
    println("\n\tAfter removing first Node")
    LinkList.indexOf(10)
    LinkList.indexOf(30)
    LinkList.removeLast()
    println("\n\tAfter removing Last Node")
    LinkList.indexOf(10)
    LinkList.indexOf(30)
}