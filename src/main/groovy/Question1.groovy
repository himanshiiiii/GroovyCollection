class Question1 {
    public static void main(String[] args) {
        List l=[]
        l[11]="myelement"
        println l[11]
        println l.get(5)
        println l



         println "\n--------------Using Range----------------"
        def myIntRange = 1..10
        myIntRange.each{num->

            if ( num%2 == 0) {
                println num
            }
        }

    }
}
