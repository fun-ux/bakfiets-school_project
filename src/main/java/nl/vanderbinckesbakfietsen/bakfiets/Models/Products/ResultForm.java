package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

public class ResultForm {

    private String huur_dagen;
    private String type_bakfiets;
    private String optional_1;
    private String optional_2;
    private String optional_3;
    private String optional_4;
    private String optional_5;


    public ResultForm() {
    }

    public ResultForm(String huur_dagen, String type_bakfiets, String optional_1, String optional_2, String optional_3, String optional_4, String optional_5) {
        this.huur_dagen = huur_dagen;
        this.type_bakfiets = type_bakfiets;
        this.optional_1 = optional_1;
        this.optional_2 = optional_2;
        this.optional_3 = optional_3;
        this.optional_4 = optional_4;
        this.optional_5 = optional_5;
    }


    public String getHuur_dagen() {
        return huur_dagen;
    }

    public void setHuur_dagen(String huur_dagen) {
        this.huur_dagen = huur_dagen;
    }

    public String getType_bakfiets() {
        return type_bakfiets;
    }

    public void setType_bakfiets(String type_bakfiets) {
        this.type_bakfiets = type_bakfiets;
    }

    public String getOptional_1() {
        return optional_1;
    }

    public void setOptional_1(String optional_1) {
        this.optional_1 = optional_1;
    }

    public String getOptional_2() {
        return optional_2;
    }

    public void setOptional_2(String optional_2) {
        this.optional_2 = optional_2;
    }

    public String getOptional_3() {
        return optional_3;
    }

    public void setOptional_3(String optional_3) {
        this.optional_3 = optional_3;
    }

    public String getOptional_4() {
        return optional_4;
    }

    public void setOptional_4(String optional_4) {
        this.optional_4 = optional_4;
    }

    public String getOptional_5() {
        return optional_5;
    }

    public void setOptional_5(String optional_5) {
        this.optional_5 = optional_5;
    }

    @Override
    public String toString() {
        return "ResultForm{" +
                "huur_dagen='" + huur_dagen + '\'' +
                ", type_bakfiets='" + type_bakfiets + '\'' +
                ", optional_1='" + optional_1 + '\'' +
                ", optional_2='" + optional_2 + '\'' +
                ", optional_3='" + optional_3 + '\'' +
                ", optional_4='" + optional_4 + '\'' +
                ", optional_5='" + optional_5 + '\'' +
                '}';
    }
}
