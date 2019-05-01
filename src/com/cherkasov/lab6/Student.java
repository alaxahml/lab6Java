package com.cherkasov.lab6;

 enum Faculty{
    MMF{
        public String toString(){
            return "MMF";
        }
    },
    FAMCS{
        public String toString(){
            return "FAMCS";
        }
    },
    RAF{
        public String toString(){
            return "RAF";
        }
    }
}
 enum StudyType{
     Extramural{
         public String toString(){
             return "Extramural";
         }
     },
     Intramural{
         public String toString(){
             return "Intramural";
         }
     }
 }
public abstract class Student implements Abiturient {
  private Integer age;
  private Integer ct_score;
  private Faculty fac;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() throws NullPointerException{

        if(age==null){
            throw new NullPointerException();
        }
        return age;

    }
    public void setCtScore(int ct_score){
        this.ct_score = ct_score;
    }
    public int  getCtScore() throws NullPointerException{

        if(ct_score==null){
            throw new NullPointerException();
        }
        return ct_score;
    }
    public void setFaculty(Faculty fac){
        this.fac=fac;
    }
    public Faculty getFaculty() throws NullPointerException{

        if (fac==null){
            throw new NullPointerException();
        }
        return fac;
    }
    public abstract StudyType getStudyType() throws ExceptionInInitializerError;
}
