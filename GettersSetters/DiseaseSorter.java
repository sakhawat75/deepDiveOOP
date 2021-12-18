package GettersSetters;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {
    public static void main(String[] args) {
        Disease polio = new Disease("polio", false);
        Disease flue = new Disease("influenza", true);
        Disease malaria = new Disease("malaria", true);
        Disease cancer = new Disease("cancer", false);

        List<Disease> diseases = new ArrayList<Disease>();
        diseases.add(polio);
        diseases.add(flue);
        diseases.add(malaria);
        diseases.add(cancer);

        cancer.setCurable(true);

        System.out.println("Curable Diseases: ");
        for (Disease disease:diseases)
        {
            if (disease.isCurable()){
                System.out.println(disease.getName());
            }
        }


    }
}
