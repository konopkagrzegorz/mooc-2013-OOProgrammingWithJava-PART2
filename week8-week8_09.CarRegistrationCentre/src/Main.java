
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        VehicleRegister owners = new VehicleRegister();
        owners.add(reg1, "ojo");
        owners.add(reg2, "bolo");
        owners.add(reg3, "ojo");
        owners.add(reg3, "kojo");
        owners.printRegistrationPlates();
        owners.printOwners();

       
    }
}
