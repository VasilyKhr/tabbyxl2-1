package ru.icc.cells.ssdc.crl2j.rulemodel.actions;

import ru.icc.cells.ssdc.crl2j.rulemodel.Identifier;

public class SetParentAction extends Action {

    public SetParentAction(int id, String name) {
        super(id, name);
    }

    private Identifier parent;

    public void setParent(Identifier parent) {
        this.parent = parent;
    }

    public Identifier getParent() {
        return parent;
    }

    private Identifier child;

    public void setChild(Identifier child) {
        this.child = child;
    }

    public Identifier getChild() {
        return child;
    }

    @Override
    public String toString() {
        return String.format("[ %d %s ( %s, %s) ]", getId(), getName(), parent.toString(), child.toString());
    }

    @Override
    public String generateAddSet() {

        StringBuilder code = new StringBuilder();

        code.append(getName()).append(getId()).append(".add( ").append(parent.getNormalForm()).append(", ").append(child.getNormalForm()).append(" )");

        return code.toString();
    }
}
