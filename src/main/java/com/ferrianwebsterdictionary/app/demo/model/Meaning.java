package com.ferrianwebsterdictionary.app.demo.model;

import java.util.List;

public class Meaning {
    private String partOfSpeech;
    private List<Definition> definitions;

    public Meaning(String partOfSpeech, List<Definition> definitions) {
        this.partOfSpeech = partOfSpeech;
        this.definitions = definitions;
    }

    public Meaning() {
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }
}