class Question2 {

    public static void main(String[] args) {
        List list=new ArrayList()
        list.add(1)
        list.add(1)
        list.add(5)
        list.add(5)
        list.add(8)
        println "List: "+list
        Set set=list as Set
        println "set: "+set

        println"---------------------same result without converting a list to a set----------------------"
        list.unique()
        println list
    }
}
