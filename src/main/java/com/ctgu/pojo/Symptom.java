package com.ctgu.pojo;

public class Symptom {
    // 发烧
    private boolean isFever;
    // 咽喉痛
    private boolean isSoreThroat;
    // 咳嗽
    private boolean isCough;
    // 鼻塞
    private boolean isNasalObstruction;
    // 流鼻涕
    private boolean isRunnyNose;
    // 胸闷
    private boolean isChestTightness;
    // 气急
    private boolean isShortnessOfBreath;
    // 呼吸困难
    private boolean isDyspnea;
    // 全身酸痛
    private boolean isBodyAche;
    // 乏力
    private boolean isFatigue;
    // 腹泻
    private boolean isDiarrhea;
    // 目前体温
    private int currentTemperature;
    // 最高体温
    private int maximumBodyTemperature;
    // 发热情况
    private int feverSituation;
    // 发热后有没有吃退热药
    private int eatAntipyretic;
    // 吃退热药后的体温情况
    private int temperatureSituation;
    // 有没有咳痰
    private int expectoration;
    // 有没有腹泻加重
    private int diarrheaAggravation;
    // 有没有胸闷加重
    private int increasedChestTightness;
    // 有没有气急加重
    private int aggravationOfDyspnea;
    // 症状时长
    private int symptomDuration;
    // 接触史
    private boolean contactHistoryOne;
    private boolean contactHistoryTwo;
    private boolean contactHistoryThree;
    private boolean contactHistoryFour;

    public boolean hasSymptom(){
        return isFever || isSoreThroat || isCough || isNasalObstruction || isRunnyNose || isChestTightness || isShortnessOfBreath || isDyspnea || isBodyAche || isFatigue || isDiarrhea;
    }

    public boolean hasContactHistory(){
        return contactHistoryOne || contactHistoryTwo || contactHistoryThree || contactHistoryFour;
    }

    public Symptom(boolean isFever, boolean isSoreThroat, boolean isCough, boolean isNasalObstruction, boolean isRunnyNose, boolean isChestTightness, boolean isShortnessOfBreath, boolean isDyspnea, boolean isBodyAche, boolean isFatigue, boolean isDiarrhea, int currentTemperature, int maximumBodyTemperature, int feverSituation, int eatAntipyretic, int temperatureSituation, int expectoration, int diarrheaAggravation, int increasedChestTightness, int aggravationOfDyspnea, int symptomDuration, boolean contactHistoryOne, boolean contactHistoryTwo, boolean contactHistoryThree, boolean contactHistoryFour) {
        this.isFever = isFever;
        this.isSoreThroat = isSoreThroat;
        this.isCough = isCough;
        this.isNasalObstruction = isNasalObstruction;
        this.isRunnyNose = isRunnyNose;
        this.isChestTightness = isChestTightness;
        this.isShortnessOfBreath = isShortnessOfBreath;
        this.isDyspnea = isDyspnea;
        this.isBodyAche = isBodyAche;
        this.isFatigue = isFatigue;
        this.isDiarrhea = isDiarrhea;
        this.currentTemperature = currentTemperature;
        this.maximumBodyTemperature = maximumBodyTemperature;
        this.feverSituation = feverSituation;
        this.eatAntipyretic = eatAntipyretic;
        this.temperatureSituation = temperatureSituation;
        this.expectoration = expectoration;
        this.diarrheaAggravation = diarrheaAggravation;
        this.increasedChestTightness = increasedChestTightness;
        this.aggravationOfDyspnea = aggravationOfDyspnea;
        this.symptomDuration = symptomDuration;
        this.contactHistoryOne = contactHistoryOne;
        this.contactHistoryTwo = contactHistoryTwo;
        this.contactHistoryThree = contactHistoryThree;
        this.contactHistoryFour = contactHistoryFour;
    }
}
