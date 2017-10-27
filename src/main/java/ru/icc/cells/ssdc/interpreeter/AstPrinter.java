package ru.icc.cells.ssdc.interpreeter;

import org.antlr.runtime.tree.Tree;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class AstPrinter {

    final char FIRST_CHAR, MIDDLE_CHAR, LAST_CHAR;

    public AstPrinter()
    {
        Charset charSet=Charset.forName("CP866");
        CharBuffer charBuff=charSet.decode(ByteBuffer.wrap(new byte[]{(byte)0xB3, (byte)0xC3, (byte)0xC0}));
        FIRST_CHAR=charBuff.charAt(0);
        MIDDLE_CHAR=charBuff.charAt(1);
        LAST_CHAR=charBuff.charAt(2);
    }

    private String getSubTree(Tree node, String ident, boolean root)
    {
        final String lineSeparator=System.lineSeparator();
        if(node==null) return "";
        StringBuilder result=new StringBuilder(ident);
        StringBuilder identifier = new StringBuilder(ident);
        if(!root) {
            if(node.getChildIndex()<node.getParent().getChildCount()-1)
            {
                result.append(MIDDLE_CHAR).append(" ");
                //ident+=FIRST_CHAR+" ";
                identifier.append(FIRST_CHAR).append(" ");
            }
            else
            {
                result.append(LAST_CHAR).append(" ");
                //ident += " ";
                identifier.append(" ");
            }
        }
        result.append(node.getText()).append(lineSeparator);
        for(int i=0;i<node.getChildCount();i++)
        {
            result.append(getSubTree(node.getChild(i),identifier.toString(),false));
        }
        return result.toString();
    }

    private String advancedGetSubTree(Tree node)
    {
        return getSubTree(node,"",true);
    }

    public void Print(Tree node)
    {
        String tree=advancedGetSubTree(node);
        System.out.println(tree);
    }
}
