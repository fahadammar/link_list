

object LinkList {
    private var first : Node ?= null
    private var last : Node ?= null

    private class Node {
         var value : Int ?= null
         var next : Node ?= null
    }

    private fun isEmpty() : Boolean{
        return first == null
    }

    fun addLast(num : Int){
        val node = Node()
        node.value = num
        if(isEmpty()){
            first  = node
            last  = node
        } else {
            last?.next = node
            last = node
        }
    }

    fun addFirst(num : Int){
        val node = Node()
        node.value = num
        if(isEmpty()){
            first = node
            last = node
        } else {
            node.next = first
            first = node
        }
    }

    fun indexOf(item : Int) : Int{
        if(!isEmpty()){
            var index = 0
            var current = first
            while(current != null){
               if(current.value == item){
                   println("Index of $item -> $index")
                   return index
               } else {
                   current = current.next
                   index++
               }
            }
            return -1
        } else return -1
    }

    fun contains(item : Int) : Boolean {
        return indexOf(item) != -1
    }

    fun removeFirst(){
        // If the link list is already emptu
        if(isEmpty())
            throw NoSuchElementException()
        else if(first == last){
            /**
             * Here if there is only 1 item in the link list
             * the first & last shall be point to it
             * */
            first = null
            last = null
            // we shall not need to check or execute the further code
            return
        } else {
            /**
             * Here below we assign the 2nd element of the linkedList to the
             * second variable. After that we set or remove the first node of the
             * linked list. Following we set the first to the secodNode, now the
             * first is pointing to the secondNode.
            * */
            val secondNode = first?.next
            first = null
            first = secondNode
        }
    }

    fun removeLast(){
        if(isEmpty())
            throw  NoSuchElementException()
        when {
            first == last -> {
                first = null
                last = null
            }
            else -> {
                val previousNode = getPreviousNode(last)
                last = null
                last = previousNode
                last?.next = null
            }
        }
    }

    private fun getPreviousNode(node : Node?) : Node?{
        var current = first
        while(current != null){
            if(current.next == node)
                return current
            current = current.next
        }
        return null
    }
}