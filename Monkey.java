public class Monkey extends RescueAnimal {
    // Monkey-specific attributes
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;

    // Rescue-related attributes to implement
    // name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry

    // Constructor with all attributes (rescue animal variables and then monkey specific ones)
    public Monkey(String name, String gender, String age, String weight, 
            String acquisitionDate, String acquisitionCountry, 
            String trainingStatus, boolean reserved, String inServiceCountry, 
            String species, double tailLength, double height, double bodyLength) { // monkey attributes at the end to find them easier
    	
        // General rescue animal attributes that are same as in dog
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        // Monkey specific attributes (to find them easier)(make sure it is similar to dog class)
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    // Monkey-specific getters and setters
    // Getter and setter for species 
    public String getSpecies() { 
    	return species; 
    	}
    
    public void setSpecies(String species) { 
    	this.species = species; 
    	}
    
    // Getter and setter for tail length
    public double getTailLength() { 
    	return tailLength; 
    	}
    
    public void setTailLength(double tailLength) { 
    	this.tailLength = tailLength; 
    	}

    // Getter and setter for height
    public double getHeight() { 
    	return height; 
    	}
    
    public void setHeight(double height) { 
    	this.height = height; 
    	}
    
    // Getter and setter for body length
    public double getBodyLength() { 
    	return bodyLength; 
    	}
    
    public void setBodyLength(double bodyLength) { 
    	this.bodyLength = bodyLength; 
    	}
    // end of monkey specific getters and setters
}
