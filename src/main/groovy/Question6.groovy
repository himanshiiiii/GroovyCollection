class Question6 {
     static void main(String[] args) {
        def i=0
        List list=[1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
        def length=list.size()
        println "length of list: "+length
        println "--------------------"
        length.times {
            def a=list[i].getClass()
            println(a)
            i++
        }


         println list.get(6)
         //println list.get(9)



    }
}
