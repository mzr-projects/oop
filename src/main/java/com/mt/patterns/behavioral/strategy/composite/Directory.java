package com.mt.patterns.behavioral.strategy.composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/*
 * Composite class
 * */
@Slf4j
@RequiredArgsConstructor
public class Directory implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> fileSystemComponents = new ArrayList<>();

    @Override
    public void show() {
        log.info("Document name: {}", name);
        for (FileSystemComponent fileSystemComponent : fileSystemComponents) {
            fileSystemComponent.show();
        }
    }

    public void add(FileSystemComponent fileSystemComponent) {
        fileSystemComponents.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent) {
        fileSystemComponents.remove(fileSystemComponent);
    }
}
