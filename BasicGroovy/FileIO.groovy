/*
java.io.File
java.io.InputStream
java.io.OutputStream
java.io.Reader
java.io.Writer
*/

import java.io.File

class Writing {
    static void main(String[] args){
        new File("/Users/babak/Desktop/Workspace/Development/groovy/BasicGroovy/example.txt").withWriter('utf-8')  {
        writer -> writer.writeLine 'Hello World' 
        }
    }
    static void append(String[] args){
        File greetingsFile = new File("/Users/babak/Desktop/Workspace/Development/groovy/BasicGroovy/exampleappend.txt")
        greetingsFile.withWriterAppend{ out -> out.println 'hello again!'}
    }


}

def w = new Writing();
println(w.main(), w.append())


class Reading {
    static void main(String[] args){
        new File("/Users/babak/Desktop/Workspace/Development/groovy/BasicGroovy/example.txt").eachLine{
        line -> println "line : $line"  
        }
    }
    static void append(String[] args){
    new File("/Users/babak/Desktop/Workspace/Development/groovy/BasicGroovy/exampleappend.txt").eachLine{
    line -> println "line : $line"  
    }
}
}

def r = new Reading();
println(r.main(), r.append())


