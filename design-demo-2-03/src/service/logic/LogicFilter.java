package service.logic;

import model.TreeNodeLink;

import java.util.List;
import java.util.Map;

public interface LogicFilter {
    Long filter(String matterValue,  List<TreeNodeLink> treeNodeLineInfoList);

    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
