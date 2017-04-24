import java.util.ArrayList;

/**
 * Created by louie on 4/23/2017.
 */
public class Channel implements Entertainment {
    private String channelName;
    private ArrayList includedChannels = new ArrayList();

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void add(Object channel) {
        includedChannels.add(channel);
    }

    public void entertainment() {
        System.out.println(Main.editor + "Channel: "+channelName);
        Main.editor.append("   ");
        for (Object includedChannel : includedChannels) {
            Entertainment obj = (Entertainment) includedChannel;
            obj.entertainment();
        }
        Main.editor.setLength(Main.editor.length() - 3);
    }
}

