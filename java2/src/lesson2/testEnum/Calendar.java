package lesson2.testEnum;

public enum Calendar {

    SEPTEMBER("сентябрь", 9), OCTOBER("октябрь", 10), NOVEMBER("ноябрь", 11), DECEMBER("декабрь", 12);

    private String russianWord;
    private int number;

    Calendar(String russianWord, int number) {
        this.russianWord = russianWord;
        this.number = number;

    }

    public String getRussianWord() {
        return russianWord;
    }



}
