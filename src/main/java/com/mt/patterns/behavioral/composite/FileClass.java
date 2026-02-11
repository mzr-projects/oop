package com.mt.patterns.behavioral.composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
* Leaf
* */
@Slf4j
@RequiredArgsConstructor
public class FileClass implements FileSystemComponent {

    private final String name;

    @Override
    public void show() {
        log.info("file name: {}", name);
    }
}
