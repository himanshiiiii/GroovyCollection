import sun.dc.pr.PRError

class Question15 {
    static void main(String[] args) {
        List list = []
        println list.add("first")
        println list.add("second")
        list.pop()
        println list

        list.push("heelp")
        println list

        println list.get(list.size() - 1)


    }
}
