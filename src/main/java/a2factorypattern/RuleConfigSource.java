package a2factorypattern;

import org.jetbrains.annotations.NotNull;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
//        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        IRuleConfigParser parser = RuleConfigParserFactory2.createaParser(ruleConfigFileExtension);
        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig parse = parser.parse(configText);
        return parse;

    }



    /**
     * 解析文件名以获取扩展名，如rule.json返回json
     *
     * @param ruleConfigFilePath
     * @return
     */
    private String getFileExtension(String ruleConfigFilePath) {

        return "json";
    }
}
