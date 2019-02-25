package com.w3dai.elasticsearch.plugin;

import org.elasticsearch.plugins.ActionPlugin;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.rest.RestHandler;

import java.util.List;

public class TermList extends Plugin implements ActionPlugin {

    public List<RestHandler> getRestHandlers(){

    }
}
