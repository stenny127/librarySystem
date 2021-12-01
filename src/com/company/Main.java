// Nice clean code, very cool much wow - Matei
package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> books = new ArrayList<>();
    private static File Library = new File("LibraryWithBooks.txt");

    public static void main(String[] args) {
        int booksToAdd = Integer.parseInt(getInput("How many books do you want to add"));
        for (int i = 0; i < booksToAdd; i++) {
            books.add(getBooks());
        }
        printBooks();
    }

    public static String getBooks() {
        String title = getInput("Enter the book's title");
        String isbn = getInput("Enter the isbn");
        String author = getInput("Enter the book's author");
        String genre = getInput("Enter the book's genre");
        return (title + "," + isbn + "," + author + "," + genre);
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void printBooks() {
        for (int i = 0; i < books.size(); i++) {
            String[] bookDetails = books.get(i).split(",");
            System.out.println(bookDetails[2]);
        }

    }

    public static void conjureFile(){
        try{
            if (Library.createNewFile()){
                System.out.println("File created: " + Library.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public static void writeToFile(){
        try{
            FileWriter myWriter = new FileWriter(Library.getName(), true);

        }
    }
}