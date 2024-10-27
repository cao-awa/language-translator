package com.github.cao.awa.language.translator.builtin.typescript.tree.statement.invoke.access;

import com.alibaba.fastjson2.JSONObject;
import com.github.cao.awa.language.translator.builtin.typescript.tree.result.TypescriptResultStatement;
import com.github.cao.awa.language.translator.builtin.typescript.tree.statement.TypescriptStatement;
import com.github.cao.awa.language.translator.translate.tree.LanguageAst;

public class TypescriptInvokeAccessArray extends TypescriptInvokeAccess {
    private TypescriptInvokeAccessElement target;
    private TypescriptResultStatement accessParam;

    public TypescriptInvokeAccessArray target(TypescriptInvokeAccessElement target) {
        this.target = target;
        return this;
    }

    public TypescriptInvokeAccessElement target() {
        return this.target;
    }

    public TypescriptInvokeAccessArray accessParam(TypescriptResultStatement accessParam) {
        this.accessParam = accessParam;
        return this;
    }

    public TypescriptResultStatement accessParam() {
        return this.accessParam;
    }

    public TypescriptInvokeAccessArray(LanguageAst parent) {
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