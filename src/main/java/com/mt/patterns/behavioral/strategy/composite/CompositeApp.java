package com.mt.patterns.behavioral.strategy.composite;

/*
 * FileClass(Leaf) and Directory(Composite) objects are used to create a tree structure of files and containers
 * The show operation displays the file system contents
 *
 * The composite pattern provides a Tree structure to hold both individual objects and composites
 * */
public class CompositeApp {

    static void main() {

        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory documents = new Directory("documents");

        FileClass file1 = new FileClass("file1");
        FileClass file2 = new FileClass("file2");
        FileClass file3 = new FileClass("file3.pdf");

        home.add(file1);
        home.add(file2);
        documents.add(file3);

        root.add(home);
        root.add(documents);
        root.show();
    }
}