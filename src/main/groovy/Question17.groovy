class Question17 {
    public static void main(String[] args) {
        Map map1 = [:]
        map1 = ["himanshi": 20, "agrima": 22, "pooja": 22]

        Map map2 = [:]
        map2 = ["neha": 25, "john": 30, "love": 35, "peter": 57, "jockey": 89]

        Map map3 = [:]
        map3 = map1 + map2

        println map3
    }
}
