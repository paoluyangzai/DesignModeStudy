package a2factorypattern;

public class PropertiesRuleConfigParser implements IRuleConfigParser{   @Override
public RuleConfig parse(String configText) {
    return new RuleConfig();
}
}
