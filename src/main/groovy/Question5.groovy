class Question5 {


    public static void main(String[] args) {
        def i=0
        def result
        List list =new ArrayList()
        list=[1, 2,3,5,3, 4, 5, 6, 7, 8, 9, 10]
        int f = 1

        while(1){
            list.remove(f)
            f++
            if(f > 6) break
        }
        println list
    }


    }


