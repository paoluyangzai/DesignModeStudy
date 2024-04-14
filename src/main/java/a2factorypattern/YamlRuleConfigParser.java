package a2factorypattern;

public class YamlRuleConfigParser implements IRuleConfigParser{
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig();
    }
}
