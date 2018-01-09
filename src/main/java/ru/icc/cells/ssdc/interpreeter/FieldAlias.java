package ru.icc.cells.ssdc.interpreeter;

import java.util.HashMap;
import java.util.Map;

public class FieldAlias {
    private Map<String, String> aliases = new HashMap<>();

    public Map<String, String> getAliases() {
        return aliases;
    }

    public FieldAlias()
    {
        aliases.put("id", "getId");
        aliases.put("cl", "getCl");
        aliases.put("cr", "getCr");
        aliases.put("rt", "getRt");
        aliases.put("rb", "getRb");
        aliases.put("height", "getHeight");
        aliases.put("width", "getWidth");
        aliases.put("style", "getStyle");
        aliases.put("font", "getFont");
        aliases.put("bold", "isBold");
        aliases.put("normal", "isNormal");
        aliases.put("rawText", "getRawText");
        aliases.put("spaceIndent", "getSpaceIndent");
        aliases.put("indent", "getIndent");
        aliases.put("type", "getType");
        aliases.put("ignored", "isIgnored");
        aliases.put("blank", "isBlank");
        aliases.put("marked", "isMarked");
        aliases.put("mark", "getMark");
        aliases.put("label", "getLabel");
        aliases.put("entry", "getEntry");
        aliases.put("text", "getText");

        aliases.put("category", "getCategory");
        aliases.put("parent", "getParent");
        aliases.put("terminal", "isTerminal");
        aliases.put("descendant", "isDescendant");

        aliases.put("labels", "getLabels");

        aliases.put("name", "getName");

    }
}
