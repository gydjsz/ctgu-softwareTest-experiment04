package com.ctgu;

import com.ctgu.enums.IntelligentRecommendationEnum;
import com.ctgu.pojo.Symptom;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;

public class DiagnosisTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/决策表.csv", numLinesToSkip = 1)
    public void judge(ArgumentsAccessor arguments) {
        Symptom symptom = new Symptom(
                arguments.getBoolean(1),
                arguments.getBoolean(2),
                arguments.getBoolean(3),
                arguments.getBoolean(4),
                arguments.getBoolean(5),
                arguments.getBoolean(6),
                arguments.getBoolean(7),
                arguments.getBoolean(8),
                arguments.getBoolean(9),
                arguments.getBoolean(10),
                arguments.getBoolean(11),
                arguments.getInteger(12),
                arguments.getInteger(13),
                arguments.getInteger(14),
                arguments.getInteger(15),
                arguments.getInteger(16),
                arguments.getInteger(17),
                arguments.getInteger(18),
                arguments.getInteger(19),
                arguments.getInteger(20),
                arguments.getInteger(21),
                arguments.getBoolean(22),
                arguments.getBoolean(23),
                arguments.getBoolean(24),
                arguments.getBoolean(25)
        );
        assertEquals(IntelligentRecommendationEnum.getResult(arguments.getInteger(26)), Diagnosis.judge(symptom));
    }

}