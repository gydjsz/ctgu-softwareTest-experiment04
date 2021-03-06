package com.ctgu.enums;

public enum IntelligentRecommendationEnum {
    RESULT_ONE(1, "建议立刻发热门诊就诊，并且佩戴好口罩做好防护。佩戴医用外科口罩或N95口罩，避免乘坐公共交通工具。"),
    RESULT_TWO(2, "结合你提供的病情症状及接触史特点，建议继续在家监测体温，可适当服用治疗感冒的中成药，注意手卫生，多饮水，休息为主。若体温持续不退或体温大于38℃或不适症状加重，及时就诊。"),
    RESULT_THREE(3, "建议你们全家及密切接触者居家隔离至少2周，在家期间建议戴口罩交流，条件允许时，尽量单独居住或居住在通风良好的单人房间。多休息，多饮水，注意手卫生和常用物品卫生消毒。若出现发热及呼吸道症状，需马上前往医院就诊。"),
    RESULT_FOUR(4, "建议您戴口罩、勤洗手，避免人群聚集，减少不必要外出。");

    private int code;
    private String text;

    IntelligentRecommendationEnum(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public static String getResult(int num) {
        for(IntelligentRecommendationEnum data : values()) {
            if(data.code == num){
                return data.text;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
