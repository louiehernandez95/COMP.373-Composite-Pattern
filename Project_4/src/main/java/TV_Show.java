/**
 * Created by louie on 4/23/2017.
 */
public class TV_Show implements Entertainment {
    private String showName;
    public TV_Show(String showName) {
        this.showName = showName;
    }
    public void entertainment() {
        System.out.println(Main.editor + "Show: "+showName);
    }
}
