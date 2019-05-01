package com.cherkasov.lab6;

public class ExtramuralStudent extends Student {
    private StudyType type=StudyType.Extramural;
    public  StudyType getStudyType() throws NullPointerException{
        return type;
    }

}
