import java.lang.* 
import java.util.* 
import java.io.* 
import java.net.* 

import groovy.lang.* 
import groovy.util.* 

import java.math.BigInteger 
import java.math.BigDecimal

int courseCount = 5
Boolean isDevOps = true
String[] singers = ["bob", "George", "Jeff", "Tom" ]

if (isDevOps){
    println "He is DevOps engineer"
}
else{
    println "He isn't DevOps engineer"
}

// basic for loop
for (int i=0; i<courseCount; i++){
    println "Babak made cource " + (i+1) + "!!!"
}

// for-in loop
for(String singer: singers){
    println singer
}

// each loop
singers.each(x -> println(x))


// while
int count = 0;
while(count<5) {
    println(count);
    count++;
}


int[] array = [0,1,2,3];
for(int i in array) {
    println(i);
    if(i == 2)
    break;
}



