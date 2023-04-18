package cleanservice;

public class Product {
    private String name;
    private String picture; 
    private String description;
    private boolean specialTreatmentRequired;
  

    public Product(String name, String picture, String description, boolean specialTreatmentRequired) {
        this.name = name;
        this.picture = picture;
        this.description = description;
        this.specialTreatmentRequired = specialTreatmentRequired;
    }

 
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSpecialTreatmentRequired() {
        return this.specialTreatmentRequired;
    }

    public void setSpecialTreatmentRequired(boolean specialTreatmentRequired) {
        this.specialTreatmentRequired = specialTreatmentRequired;
    }


	
}