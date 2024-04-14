package a2factorypattern;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory2 {
    private static final Map<String,IRuleConfigParser> cachedParser = new HashMap<>();
    static {
        cachedParser.put("json",new JsonRuleConfigParser());
        cachedParser.put("xml",new XmlRuleConfigParser());
        cachedParser.put("yaml",new YamlRuleConfigParser());
        cachedParser.put("properties",new PropertiesRuleConfigParser());
    }
    public static IRuleConfigParser createaParser(String configFormat){
        if (configFormat==null||configFormat.isEmpty()){
            return null;
        }
        return cachedParser.get(configFormat.toLowerCase());
    }
}
