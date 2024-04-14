package a2factorypattern;

public class JsonRuleConfigParser implements IRuleConfigParser{
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig();
    }
}
