Navigate to 'src' folder in terminal and enter the following commands successively. 

javac lexer/*.java
javac symbols/*.java
javac inter/*.java
javac parser/*.java
javac main/*.java
java main.Main 
 
<paste in the following>

{
int i; int j; float v; float x; float[100] a;

while( true ){

    do i = i + 1; while ( a[i] < v);
    do j = j - 1; while ( a[j] > v);
    if ( i >= j) break;
    x  = a[i]; a[i] = a[j]; a[j] = x;

    }

}

<type in a random letter and hit enter>

 