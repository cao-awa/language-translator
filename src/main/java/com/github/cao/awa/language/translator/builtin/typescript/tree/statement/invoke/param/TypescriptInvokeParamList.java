package com.github.cao.awa.language.translator.builtin.typescript.tree.statement.invoke.param;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.language.translator.builtin.typescript.tree.statement.TypescriptStatement;
import com.github.cao.awa.language.translator.builtin.typescript.tree.statement.invoke.TypescriptInvoke;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;
import com.github.cao.awa.sinuatum.util.collection.CollectionFactor;

import java.util.List;

public class TypescriptInvokeParamList extends TypescriptStatement {
    private final List<TypescriptInvokeParam> params = CollectionFactor.linkedList();

    public TypescriptInvokeParamList addParam(TypescriptInvokeParam invokeTarget) {
        this.params.add(invokeTarget);
        return this;
    }

    public List<TypescriptInvokeParam> params() {
        return this.params;
    }

    public TypescriptInvokeParamList(LanguageAst parent) {
        super(parent);
    }

    @Override
    public void generateStructure(JSONObject json) {

    }

    @Override
    public void preprocess() {

    }

    @Override
    public void postprocess() {

    }

    @Override
    public void consequence() {

    }
}
