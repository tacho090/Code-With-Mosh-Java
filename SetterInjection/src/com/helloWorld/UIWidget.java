package com.helloWorld;

public interface UIWidget extends Draggable, Resizable {
    void drag();
    void resize(int size);
    void render();
}

