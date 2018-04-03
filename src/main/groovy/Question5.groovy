class Question5 {
    static void main(String[] args) {
        def i=0
        def result
        List list=[1, 2,3,5,3, 4, 5, 6, 7, 8, 9, 10]
        int f = 1
        while(1){
            list.remove(f)
            f++
            if(f > 6) break
        }
        println list
    }


    }



