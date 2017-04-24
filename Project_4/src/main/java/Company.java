import java.util.ArrayList;

/**
 * Created by louie on 4/23/2017.
 */
public class Company implements Entertainment {
    private String companyName;
    private ArrayList includedCompanies = new ArrayList();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void add(Object company) {
        includedCompanies.add(company);
    }

    public void entertainment() {
        System.out.println("Company: "+Main.editor + companyName);
        Main.editor.append("   ");
        for (Object includedCompany : includedCompanies) {
            Entertainment obj = (Entertainment) includedCompany;
            obj.entertainment();
        }
        Main.editor.setLength(Main.editor.length() - 3);
    }
}