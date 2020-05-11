package com.ctgu;

import com.ctgu.enums.IntelligentRecommendationEnum;
import com.ctgu.pojo.Symptom;

public class Diagnosis {

    public static String judge(Symptom symptom){
        if(symptom.hasSymptom()){
            if(symptom.hasContactHistory()){
                return IntelligentRecommendationEnum.RESULT_ONE.toString();
            }
            else {
                return IntelligentRecommendationEnum.RESULT_TWO.toString();
            }
        }
        else {
            if(symptom.hasContactHistory()){
                return IntelligentRecommendationEnum.RESULT_THREE.toString();
            }
            else {
                return IntelligentRecommendationEnum.RESULT_FOUR.toString();
            }
        }
    }

}
