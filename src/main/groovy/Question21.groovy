class Question21 {
    public static void main(String[] args) {
        Map m=new HashMap()
        m = ['Computing' :['Computing' : 600, 'InformationSystems' : 300], 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management' : ['Management' : 800] ]
        println m
        println "university departments are: "+m.keySet()
        println m.get('Computing')
        println m.get('Engineering').Civil

    }
}
