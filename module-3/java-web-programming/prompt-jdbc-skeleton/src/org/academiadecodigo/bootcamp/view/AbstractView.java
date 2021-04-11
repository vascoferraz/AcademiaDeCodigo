package org.academiadecodigo.bootcamp.view;

import org.academiadecodigo.bootcamp.Prompt;

public abstract class AbstractView implements View {

    protected Prompt prompt;

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }
}
