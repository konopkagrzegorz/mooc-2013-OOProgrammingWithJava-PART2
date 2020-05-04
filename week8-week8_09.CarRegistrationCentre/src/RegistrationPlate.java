
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }
    
    

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        RegistrationPlate temp = (RegistrationPlate) object;
        if (this.regCode == null || !(this.regCode.equals(temp.getRegCode()))) {
            return false;
        }
        if (this.country == null || !(this.country.equals(temp.getCountry()))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        if (this.regCode == null) {
            return hash;
        }
        hash = 31 * hash + this.regCode.hashCode();
        hash = 31 * hash + this.country.hashCode();
        return hash;
    }
}
