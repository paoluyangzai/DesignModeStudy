package a2factorypattern;

import org.jetbrains.annotations.NotNull;

public class RuleConfigParserFactory {

    @NotNull
    public static IRuleConfigParser createParser(String ruleConfigFileExtension) throws InvalidRuleConfigException {
        IRuleConfigParser parser;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new InvalidRuleConfigException("暂不支持" + ruleConfigFileExtension);
        }
        return parser;
    }
}
