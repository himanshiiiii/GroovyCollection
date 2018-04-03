class Question12 {
    public static void main(String[] args) {
        List alphabet='a'..'z'
        println alphabet
        alphabet.eachWithIndex{String entry, int i ->
            if(i>9){
          println(entry)
            }
        }
    }
}
