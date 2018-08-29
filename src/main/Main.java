package main;

import lexer.*;
import parser.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

//        if(args.length >= 2){
//    	
//        try{
//            FileInputStream fis=new FileInputStream("/home/sam/eclipse-workspace/Compiler/src/in0.c");
//            System.setIn(fis);
//        	System.out.println("here");
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//
//        PrintStream ps=new PrintStream(new FileOutputStream(args[1]));
//        System.setOut(ps);
//        }

        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.write('\n');
    }

}
