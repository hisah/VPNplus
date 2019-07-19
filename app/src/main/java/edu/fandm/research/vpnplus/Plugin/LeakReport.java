package edu.fandm.research.vpnplus.Plugin;

import java.util.ArrayList;
import java.util.List;

import edu.fandm.research.vpnplus.VPNConfiguration.ConnectionMetaData;

/**
 * Created by justinhu on 16-03-09.
 */
public class LeakReport {

    public enum LeakCategory{
        LOCATION,
        USER,
        DEVICE,
        KEYWORD
    }

    public ConnectionMetaData metaData;
    public LeakCategory category;
    public List<LeakInstance> leaks;

    public LeakReport(LeakCategory category){
        this.category = category;
        this.leaks = new ArrayList<>();
    }

    public LeakReport(LeakCategory category, List<LeakInstance> leaks){
        this.category = category;
        this.leaks = leaks;
    }

    public void addLeak(LeakInstance leak){
        this.leaks.add(leak);
    }

    public void addLeaks(List<LeakInstance> leaks){
        this.leaks.addAll(leaks);
    }
}

