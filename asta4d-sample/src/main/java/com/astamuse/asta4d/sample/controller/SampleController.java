package com.astamuse.asta4d.sample.controller;

import static com.astamuse.asta4d.web.dispatch.HttpMethod.POST;

import com.astamuse.asta4d.misc.spring.mvc.controller.GenericControllerBase;
import com.astamuse.asta4d.sample.handler.EchoHandler;
import com.astamuse.asta4d.sample.handler.FormCompleteHandler;
import com.astamuse.asta4d.sample.handler.FormValidateHandler;
import com.astamuse.asta4d.sample.handler.LoginHandler;
import com.astamuse.asta4d.web.dispatch.mapping.ext.UrlMappingRuleHelper;

public class SampleController extends GenericControllerBase {

    @Override
    protected void initUrlMappingRules(UrlMappingRuleHelper rules) {
        rules.add("/app/", "/templates/index.html");
        rules.add("/app/index", "/templates/index.html");

        rules.add("/app/snippet", "/templates/snippet.html");
        rules.add("/app/{name}/{age}", "/templates/variableinjection.html").setPriority(1);
        rules.add("/app/attributevalues", "/templates/attributevalues.html");

        rules.add("/app/extend/appendchild", "/templates/extend/appendchild.html");
        rules.add("/app/extend/insertchild", "/templates/extend/insertchild.html");
        rules.add("/app/extend/overridechild", "/templates/extend/overridechild.html");

        rules.add("/app/embed/main", "/templates/embed/main.html");

        rules.add("/app/handler", "/templates/success.html", LoginHandler.class, EchoHandler.class);

        rules.add("/app/renderertypes", "/templates/renderertypes.html");
        rules.add("/app/passvariables", "/templates/passvariables.html");
        rules.add("/app/dynamicsnippet", "/templates/dynamicsnippet.html");

        rules.add("/app/contextdata", "/templates/contextdata.html");

        rules.add("/app/form/input", "/templates/form/input.html");
        rules.add(POST, "/app/form/confirm", FormValidateHandler.class);
        rules.add(POST, "/app/form/complete", FormCompleteHandler.class);
    }
}
