package a2factorypattern;

public class XmlRuleConfigParser implements IRuleConfigParser{
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig();
    }
}
