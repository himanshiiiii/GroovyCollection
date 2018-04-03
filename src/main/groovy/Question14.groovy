class Question14 {
     static void main(String[] args) {
        def i = 0
        List list = 1..100
        println list

        100.times{

             if (list[i] % 3 == 0 && list[i] % 5 == 0) {
                println("fizzbuzz")
                 i++

            }
            else if (list[i] % 3 == 0) {
                println("fizz")
                 i++

            }
            else if (list[i] % 5 == 0) {
                println("buzz")
                 i++
             }
             else{
                println(list[i])
                i++
            }
        }
    }
}
