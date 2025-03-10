package singleton;

import java.util.ArrayList;
import java.util.List;

public class BranchManager {
    private static BranchManager instance;
    private List<String> branches = new ArrayList<>();

    private BranchManager() {}  // Закритий конструктор

    public static BranchManager getInstance() {
        if (instance == null) {
            instance = new BranchManager();
        }
        return instance;
    }

    public void addBranch(String branch) {
        branches.add(branch);
    }

    public void showBranches() {
        System.out.println("Відділення: " + branches);
    }
}
