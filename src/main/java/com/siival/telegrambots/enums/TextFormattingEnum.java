package com.siival.telegrambots.enums;

public enum TextFormattingEnum {
    MarkdownV2("MarkdownV2"),
    HTML("HTML"),
    Markdown("Markdown")
    ;
    String name;
    TextFormattingEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
